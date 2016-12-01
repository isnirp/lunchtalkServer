package com.alekea;

import com.alekea.service.Api;
import com.alekea.service.Controller;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

/**
 * Created by Prince on 01.12.2016.
 */
public class Dummy {
    public static void main(String[] args) {
        Api api = new Api();
        api.registerRoutes();


        /*staticFileLocation("/public");
        get("/index", ((request, response) ->
                "<!DOCTYPE html>" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Title</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>"));*/
    }
}
