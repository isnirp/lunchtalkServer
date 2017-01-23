package com.alekea;

import com.alekea.dao.impl.ClientDao;
import com.alekea.dao.impl.DataSource;
import com.alekea.dao.impl.TalkDao;
import com.alekea.service.Controller;

import static spark.Spark.get;

/**
 * Created by Prince on 01.12.2016.
 */
public class Dummy {
    public static void main(String[] args) {
        DataSource datasource = new DataSource(new ClientDao(), new TalkDao());
        Controller controller = new Controller(datasource);
        controller.registerRoutes();
    }
}
