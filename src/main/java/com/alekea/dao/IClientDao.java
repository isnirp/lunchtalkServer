package com.alekea.dao;

import com.alekea.model.Client;

import java.util.List;

/**
 * Created by Prince on 23.11.2016.
 */
public interface IClientDao {
    void saveClient(Client client);

    Client getClient(String token);

    List<Client> getClients();

}
