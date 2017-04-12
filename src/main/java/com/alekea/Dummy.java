package com.alekea;

import com.alekea.dao.ClientDao;
import com.alekea.dao.DataSource;
import com.alekea.dao.TalkDao;
import com.alekea.service.Controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Prince on 01.12.2016.
 */
public class Dummy {
    public static void main(String[] args) {
        DataSource datasource = new DataSource(new ClientDao(), new TalkDao());
        Controller controller = new Controller(datasource);
        controller.registerRoutes();
    }

    public static class LexicoCompare implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }
}
