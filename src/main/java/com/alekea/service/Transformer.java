package com.alekea.service;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by Fifi on 12/2/2016.
 */
public class Transformer implements ResponseTransformer {
    Gson gson = new Gson();
    @Override
    public String render(Object model) throws Exception {
        return gson.toJson(model);
    }
}
