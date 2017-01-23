package com.alekea.dao.impl;

import com.alekea.model.Talk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prince on 23.11.2016.
 */
public class TalkDao {
    /*
    * Cache talk
    * */
    private Map<String, Talk> mapTalk;

    public TalkDao() {
        mapTalk = new LinkedHashMap<>();
    }

    public void saveTalk(Talk talk) {
        mapTalk.put(talk.getSubject(), talk);
    }

    public void updateTalk() {
    }

    public Talk getTalk(String subject) {
        return mapTalk.get(subject);
    }

    public List<Talk> getTalks() {
        return new ArrayList<>(mapTalk.values());
    }

    public void deleteTalk(String subject) {
        mapTalk.remove(subject);
    }
}
