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
        Datasource datasource = new DataSourceImpl(new ClientDaoImpl(),new TalkDaoImpl());
        Controller controller = new Controller(datasource);
        controller.registerRoutes();

    }
}
