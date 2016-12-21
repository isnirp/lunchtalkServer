package com.alekea.dao;

import com.alekea.model.MobileClient;

import java.util.List;

/**
 * Created by Prince on 23.11.2016.
 */
public interface ClientDao {
    void saveClient(MobileClient mobileClient);

    MobileClient getClient(String token);

    List<MobileClient> getClients();

}
