package com.alekea.dao.impl;

import com.alekea.dao.ITalkDao;
import com.alekea.model.Talk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prince on 23.11.2016.
 */
public class TalkDaoImpl implements ITalkDao {
    private Map<String,Talk> mapTalk;

    public TalkDaoImpl(){
        mapTalk = new LinkedHashMap<>();
    }
    @Override
    public String saveTalk(Talk talk) {
        mapTalk.put(talk.getSubject(),talk);
        //return talk.getSubject();
        return "talk added";
    }

    @Override
    public void updateTalk() {

    }

    @Override
    public Talk getTalk(String subject) {
        return mapTalk.get(subject);
    }

    @Override
    public List<Talk> getTalks() {
        return new ArrayList<>(mapTalk.values());
    }

    @Override
    public void deleteTalk(String subject) {
        mapTalk.remove(subject);
    }
}
