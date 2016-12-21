package com.alekea.dao.impl;

import com.alekea.dao.ClientDao;
import com.alekea.model.MobileClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fifi on 12/11/2016.
 */
public class ClientDaoImpl implements ClientDao {
    /*
    * cache clients token
    * */
    Map<String, MobileClient> clientzMap;

    public ClientDaoImpl() {
        clientzMap = new HashMap<>();
    }

    @Override
    public void saveClient(MobileClient mobileClient) {
        clientzMap.put(mobileClient.getToken(), mobileClient);
    }

    @Override
    public MobileClient getClient(String token) {
        return clientzMap.get(token);
    }

    @Override
    public List<MobileClient> getClients() {
        return new ArrayList<>(clientzMap.values());
    }
}
