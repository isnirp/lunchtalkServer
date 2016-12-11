package com.alekea.dao.impl;

import com.alekea.dao.IClientDao;
import com.alekea.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fifi on 12/11/2016.
 */
public class ClientDaoImpl implements IClientDao {
    /*
    * cache clients token
    * */
    Map<String, Client> clientzMap;

    public ClientDaoImpl() {
        clientzMap = new HashMap<>();
    }

    @Override
    public void saveClient(Client client) {
        clientzMap.put(client.getToken(), client);
    }

    @Override
    public Client getClient(String token) {
        return clientzMap.get(token);
    }

    @Override
    public List<Client> getClients() {
        return new ArrayList<>(clientzMap.values());
    }
}
