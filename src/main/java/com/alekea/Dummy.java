package com.alekea;

import com.alekea.dao.Datasource;
import com.alekea.dao.impl.ClientDaoImpl;
import com.alekea.dao.impl.DataSourceImpl;
import com.alekea.dao.impl.TalkDaoImpl;
import com.alekea.service.Controller;

import static spark.Spark.get;

/**
 * Created by Prince on 01.12.2016.
 */
public class Dummy {
    public static void main(String[] args) {
        /*Datasource datasource = new DataSourceImpl(new ClientDaoImpl(),new TalkDaoImpl());
        Controller controller = new Controller(datasource);
        controller.registerRoutes();*/
        /*String x = new String("ab");
        change(x);
        System.out.println(x);*/
        //System.out.println(String.format("An integer: %d and a string: %s", 1, "hello"));
        double[] arr = new double[3];
        System.out.println(arr.getClass());
    }
    /*public static void change(String x) {
        x = "cd";
    }*/
}
