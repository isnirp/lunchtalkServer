package com.alekea.service;

import com.alekea.dao.TalksRepo;
import com.alekea.model.Talks;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 */
public class Controller {
    private TalksRepo talksRepo;
    private Gson gson;
    private String message;

    public Controller(TalksRepo talksRepo) {
        this.talksRepo = talksRepo;
        gson = new Gson();
    }

    /*
    * Register all routes
    * */
    public void registerRoutes() {
        /*
        * Route for collecting all lunch talks
        * */
        get("talks", ((request, response) -> {
            response.type("application/json");
            return talksRepo.getTalks();
        }), gson::toJson);

        /*
        * Route for adding new lunch talk
        * */
        post("/addtalk", ((request, response) -> {
            response.type("application/json");
            Talks talk = gson.fromJson(request.body(), Talks.class);
            talksRepo.addTalk(talk);

            return "success";
        }), gson::toJson);

    }
}
