package com.alekea.dao.impl;

import com.alekea.dao.TalkDao;
import com.alekea.model.Talk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prince on 23.11.2016.
 */
public class TalkDaoImpl implements TalkDao {
    /*
    * Cache talk
    * */
    private Map<String, Talk> mapTalk;

    public TalkDaoImpl() {
        mapTalk = new LinkedHashMap<>();
    }

    @Override
    public void saveTalk(Talk talk) {
        mapTalk.put(talk.getSubject(), talk);
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
