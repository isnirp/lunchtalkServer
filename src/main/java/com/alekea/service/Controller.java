package com.alekea.service;

import com.alekea.dao.TalksRepo;
import com.alekea.model.Talks;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 *
 * Using spark to create rest api
 */
public class Controller {
    private TalksRepo mTalksRepo;
    private Gson mGson;
    private String message;

    public Controller(TalksRepo talksRepo) {
        this.mTalksRepo = talksRepo;
        mGson = new Gson();
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
            return mTalksRepo.getTalks();
        }), mGson::toJson);

        /*
        * Route for adding new lunch talk
        * */
        post("/addtalk", ((request, response) -> {
            response.type("application/json");
            Talks talk = mGson.fromJson(request.body(), Talks.class);
            mTalksRepo.addTalk(talk);

            return "success";
        }), mGson::toJson);

    }
}
