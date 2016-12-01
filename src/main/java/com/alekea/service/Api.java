package com.alekea.service;

import com.alekea.model.Talk;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 24.11.2016.
 */
public class Api {
    private Controller controller;
    private Gson gson;

    public Api() {
        controller = new Controller();
        gson = new Gson();
    }

    public void registerRoutes() {
        //get all talk
        get("/talks", ((request, response) -> controller.getTalkAll()),gson::toJson);
        //add talk
        post("/addtalk", ((request, response) -> {
            Talk talk = new Talk();
            talk.setSubject(request.queryParams("sub"));
            talk.setTechnology(request.queryParams("tech"));
            talk.setNotes(request.queryParams("notes"));
            return controller.addTalk(talk);
        }
        ));
    }
}
