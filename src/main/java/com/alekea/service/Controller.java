package com.alekea.service;

import com.alekea.dao.impl.DataSource;
import com.alekea.model.MobileClient;
import com.alekea.model.FirebaseMessage;
import com.alekea.model.MyResponse;
import com.alekea.model.Talk;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 */
public class Controller {
    private DataSource datasource;
    private Gson gson;
    private String message;

    public Controller(DataSource datasource) {
        this.datasource = datasource;
        gson = new Gson();
    }

    public void registerRoutes() {
        get("talks", ((request, response) -> {
            response.type("application/json");
            return new MyResponse("ok", datasource.getTalkAll());
        }), gson::toJson);

        get("clients", ((request, response) -> {
            response.type("application/json");
            return datasource.getClientAll();
        }), gson::toJson);

        post("/addtalk", ((request, response) -> {
            response.type("application/json");
            Talk talk = gson.fromJson(request.body(), Talk.class);

            datasource.addTalk(talk, new DataSource.OnAddResourceListener() {
                @Override
                public void onSuccess() {
                    message = talk.getSubject() + " successfully added";
                    //send notification to mobile client
                    FirebaseMessage.Notification notification = new FirebaseMessage.Notification(talk.getSubject(), talk.getNotes());
                    for (MobileClient mobileClient : datasource.getClientAll()) {
                        sendNotification(new FirebaseMessage(mobileClient.getToken(), notification));
                    }
                }

                @Override
                public void onFailure() {
                    message = "failed to add talk";
                }
            });
            return new MyResponse(message);
        }), gson::toJson);

        post("/addclient", ((request, response) -> {
            response.type("application/json");
            MobileClient mobileClient = gson.fromJson(request.body(), MobileClient.class);
            datasource.addClient(mobileClient, new DataSource.OnAddResourceListener() {
                @Override
                public void onSuccess() {
                    message = "New MobileClient";
                }

                @Override
                public void onFailure() {
                    message = "Adding MobileClient failed";
                }
            });
            return new MyResponse(message);
        }));
    }

    private void sendNotification(final FirebaseMessage firebaseMessage) {
       /* Map<String, String> headersMap = new HashMap<>();
        headersMap.put("Content-Type", "application/json");
        headersMap.put("Authorization:key=", FirebaseUtil.AUTHENTICATION_KEY);

        Future<HttpResponse<JsonNode>> future = Unirest.post(FirebaseUtil.SEND)
                .headers(headersMap)
                .body(firebaseMessage)
                .asJsonAsync(new Callback<JsonNode>() {
                    @Override
                    public void completed(HttpResponse<JsonNode> httpResponse) {
                        System.out.println(httpResponse.getStatus() + "\n" + httpResponse.getBody());
                    }

                    @Override
                    public void failed(UnirestException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void cancelled() {

                    }
                });*/
    }

}
