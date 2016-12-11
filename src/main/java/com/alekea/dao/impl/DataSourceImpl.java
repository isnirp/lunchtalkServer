package com.alekea.dao.impl;

import com.alekea.dao.IClientDao;
import com.alekea.dao.IDatasource;
import com.alekea.dao.ITalkDao;
import com.alekea.model.Client;
import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class DataSourceImpl implements IDatasource {
    private IClientDao clientDao;
    private ITalkDao talkDao;

    public DataSourceImpl(IClientDao clientDao, ITalkDao talkDao) {
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
    public void addClient(Client client, OnAddResourceListener listener) {
        clientDao.saveClient(client);
    }

    @Override
    public Client getClient(String token) {
        return clientDao.getClient(token);
    }

    @Override
    public List<Client> getClientAll() {
        return clientDao.getClients();
    }
}
