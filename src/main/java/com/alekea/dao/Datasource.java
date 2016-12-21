package com.alekea.dao;

import com.alekea.model.MobileClient;
import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Prince on 23.11.2016.
 */
public interface Datasource {
    void addTalk(Talk talk, OnAddResourceListener listener);

    List<Talk> getTalkAll();

    Talk getTalkBySubject(String subject);

    void addClient(MobileClient mobileClient, OnAddResourceListener listener);

    MobileClient getClient(String token);

    List<MobileClient> getClientAll();

    interface OnAddResourceListener{
        void onSuccess();
        void onFailure();
    }
}
