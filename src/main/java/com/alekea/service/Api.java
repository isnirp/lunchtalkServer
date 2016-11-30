package com.alekea.service;

import com.alekea.model.Talk;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 24.11.2016.
 */
public class Api {
    private Controller controller;

    public Api(Controller controller) {
        this.controller = controller;
    }

    public void registerRoutes() {
        //get all talk
        get("/talks", ((request, response) -> controller.getTalkAll()));
        //add talk
        post("/talks", ((request, response) -> {
            Talk talk = new Talk();
            talk.setSubject(request.params("subject"));
            talk.setTechnology(request.params("technology"));
            talk.setNotes(request.params("notes"));
            return controller.addTalk(talk);
        }
        ));
    }
    //get all topics
    //get by id
    //send token
}
