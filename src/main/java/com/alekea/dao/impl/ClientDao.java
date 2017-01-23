package com.alekea.dao.impl;

import com.alekea.model.MobileClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fifi on 12/11/2016.
 */
public class ClientDao {
    /*
    * cache clients token
    * */
    Map<String, MobileClient> clientzMap;

    public ClientDao() {
        clientzMap = new HashMap<>();
    }


    public void saveClient(MobileClient mobileClient) {
        clientzMap.put(mobileClient.getToken(), mobileClient);
    }


    public MobileClient getClient(String token) {
        return clientzMap.get(token);
    }


    public List<MobileClient> getClients() {
        return new ArrayList<>(clientzMap.values());
    }
}
