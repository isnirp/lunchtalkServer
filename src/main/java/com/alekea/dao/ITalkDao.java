package com.alekea.dao;

import com.alekea.model.Talk;

import java.util.List;

/**
 * Created by Prince on 23.11.2016.
 */
public interface ITalkDao {
    void addTalk(Talk talk);

    void updateTalk();

    Talk getTalk(String title);

    List<Talk> getTalks();

    void deleteTalk();

}
