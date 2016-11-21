package com.alekea;

//import static spark.route.HttpMethod.get;
import static spark.Spark.*;

/**
 * Created by Prince on 21.11.2016.
 */
public class Hello {
    public static void main(String[] args){
        //get("/hello",(req,res)-> "Hello world");
        get("/hello/:name",(req,res)-> {
            return "Hello " + req.params(":name")+" "+ req.ip();
        });
    }
}
