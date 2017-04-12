package com.alekea.dao;

import com.alekea.model.MobileClient;
import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class DataSource {
    private ClientDao clientDao;
    private TalkDao talkDao;

    public DataSource(ClientDao clientDao, TalkDao talkDao) {
        this.clientDao = clientDao;
        this.talkDao = talkDao;
    }

    public void addTalk(Talk talk, OnAddResourceListener listener) {
        if(talk==null){
            listener.onFailure();
        }else{
            talkDao.saveTalk(talk);
            listener.onSuccess();
        }
    }

    public List<Talk> getTalkAll() {
        return talkDao.getTalks();
    }

    public Talk getTalkBySubject(String subject) {
        return talkDao.getTalk(subject);
    }

    public void addClient(MobileClient mobileClient, OnAddResourceListener listener) {
        clientDao.saveClient(mobileClient);
    }

    public MobileClient getClient(String token) {
        return clientDao.getClient(token);
    }

    public List<MobileClient> getClientAll() {
        return clientDao.getClients();
    }

    public interface OnAddResourceListener{
        void onSuccess();
        void onFailure();
    }
}
