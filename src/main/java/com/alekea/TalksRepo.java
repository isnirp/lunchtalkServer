package com.alekea;

import com.alekea.model.Talks;
import com.alekea.model.User;

import java.util.*;

/**
 * Created by Fifi on 4/12/2017.
 *
 * A simple repository for lunch talks
 */
public class TalksRepo {
    /*
    * cache talks in a map
    * key String subject
    * value Talks
     */
    private Map<String, Talks> userTalksMap;

    public TalksRepo() {
        userTalksMap = new HashMap<>();
    }

    public void addTalk(Talks talks) {
        userTalksMap.put(talks.getSubject(), talks);
    }

    public synchronized void deleteTalk(String subject) {
        userTalksMap.remove(subject);
    }

    private Talks getTalk(String subject) {
        return userTalksMap.get(subject);
    }

    public List<Talks> getTalks() {
        return new ArrayList<>(userTalksMap.values());
    }
}
