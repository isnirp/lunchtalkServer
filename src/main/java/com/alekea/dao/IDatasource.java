package com.alekea.dao;

import com.alekea.model.Client;
import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Prince on 23.11.2016.
 */
public interface IDatasource {
    void addTalk(Talk talk, OnAddResourceListener listener);

    List<Talk> getTalkAll();

    Talk getTalkBySubject(String subject);

    void addClient(Client client, OnAddResourceListener listener);

    Client getClient(String token);

    interface OnAddResourceListener{
        void onSuccess();
        void onFailure();
    }
}
