package com.alekea.service;

import com.alekea.dao.ITalkDao;
import com.alekea.dao.impl.TalkDaoImpl;
import com.alekea.model.Talk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prince on 30.11.2016.
 */
public class Controller {
    Map<Integer,Talk> map = new LinkedHashMap<>();
    ITalkDao talkDao = new TalkDaoImpl();

    public Controller(){

    }
    public List<Talk> getTalkAll(){
        return talkDao.getTalks();
    }
    public String addTalk(Talk talk){
        return talkDao.saveTalk(talk);
    }
    public Talk getTalkBySubject(String subject){
        return talkDao.getTalk(subject);
    }
}
