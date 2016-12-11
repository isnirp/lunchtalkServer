package com.alekea.service;

import com.alekea.dao.IDatasource;
import com.alekea.dao.ITalkDao;
import com.alekea.dao.impl.TalkDaoImpl;
import com.alekea.model.MyResponse;
import com.alekea.model.Talk;
import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 */
public class Controller {
    private IDatasource datasource;
    private Gson gson;
    private String msg;

    public Controller(IDatasource datasource) {
        this.datasource = datasource;
        gson = new Gson();
    }

    public void registerRoutes() {
        get("talks", ((request, response) -> {
            response.type("application/json");
            datasource.getTalkAll();
            return datasource.getTalkAll();
        }), gson::toJson);

        post("/addtalk", ((request, response) -> {
            response.type("application/json");
            Talk talk = gson.fromJson(request.body(), Talk.class);

            datasource.addTalk(talk, new IDatasource.OnAddResourceListener() {
                @Override
                public void onSuccess() {
                    msg = talk.getSubject() + " successfully added";
                }

                @Override
                public void onFailure() {
                    msg = "failed to add talk";
                }
            });
            return new MyResponse(msg);
        }), gson::toJson);
    }

}
