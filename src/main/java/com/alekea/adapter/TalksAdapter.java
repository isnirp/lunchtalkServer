package com.alekea.adapter;

import com.alekea.dao.TalksRepo;
import com.alekea.model.Talks;
import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Fifi on 10/24/2017.
 */
public class TalksAdapter implements TalksContract {
    private TalksRepo mTalksRepo;
    private Gson mGson;

    public TalksAdapter(TalksRepo mTalksRepo) {
        this.mTalksRepo = mTalksRepo;
        mGson = new Gson();
    }

    @Override
    public void getTalk() {
        /*
        * Route for collecting all lunch talks
        * */
        get("talks", ((request, response) -> {
            response.type("application/json");
            return mTalksRepo.getTalks();
        }), mGson::toJson);
    }

    @Override
    public void addTalk() {
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
