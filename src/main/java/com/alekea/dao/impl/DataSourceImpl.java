package com.alekea.dao.impl;

import com.alekea.dao.ClientDao;
import com.alekea.dao.Datasource;
import com.alekea.dao.TalkDao;
import com.alekea.model.MobileClient;
import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class DataSourceImpl implements Datasource {
    private ClientDao clientDao;
    private TalkDao talkDao;

    public DataSourceImpl(ClientDao clientDao, TalkDao talkDao) {
        this.clientDao = clientDao;
        this.talkDao = talkDao;
    }

    @Override
    public void addTalk(Talk talk, OnAddResourceListener listener) {
        if(talk==null){
            listener.onFailure();
        }else{
            talkDao.saveTalk(talk);
            listener.onSuccess();
        }
    }

    @Override
    public List<Talk> getTalkAll() {
        return talkDao.getTalks();
    }

    @Override
    public Talk getTalkBySubject(String subject) {
        return talkDao.getTalk(subject);
    }

    @Override
    public void addClient(MobileClient mobileClient, OnAddResourceListener listener) {
        clientDao.saveClient(mobileClient);
    }

    @Override
    public MobileClient getClient(String token) {
        return clientDao.getClient(token);
    }

    @Override
    public List<MobileClient> getClientAll() {
        return clientDao.getClients();
    }
}
