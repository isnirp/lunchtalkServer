package com.alekea.service;

import com.alekea.dao.IDatasource;
import com.alekea.model.Client;
import com.alekea.model.MyResponse;
import com.alekea.model.Talk;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 */
public class Controller {
    private IDatasource datasource;
    private Gson gson;
    private String message;

    public Controller(IDatasource datasource) {
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

            datasource.addTalk(talk, new IDatasource.OnAddResourceListener() {
                @Override
                public void onSuccess() {
                    message = talk.getSubject() + " successfully added";
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
            Client client = gson.fromJson(request.body(), Client.class);
            datasource.addClient(client, new IDatasource.OnAddResourceListener() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onFailure() {

                }
            });
            return new MyResponse("New Client");
        }));
    }

    private void sendNotification(Talk talk) {

    }

}
