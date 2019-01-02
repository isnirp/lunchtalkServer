package com.alekea;

import com.alekea.TalksAdapter;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Prince on 30.11.2016.
 * <p>
 * Using spark to create rest api
 */
public class TalkService {
    private TalksAdapter mAdapter;

    public TalkService(TalksAdapter adapter) {
        this.mAdapter = adapter;
    }

    /*
    * Register all routes
    * */
    public void registerRoutes() {
        mAdapter.getTalk();
        mAdapter.addTalk();
    }
}
