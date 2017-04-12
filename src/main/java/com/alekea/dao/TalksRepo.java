package com.alekea.dao;

import com.alekea.model.Talks;
import com.alekea.model.User;

import java.util.*;

/**
 * Created by Fifi on 4/12/2017.
 */
public class TalksRepo {
    Map<User,Talks> userTalksMap = new HashMap<>();
    private User user;

    public TalksRepo(User user) {
        this.user = user;
    }

    public void saveTalk(Talks talks){
        userTalksMap.put(user,talks);
    }
    public void deleteTalk(String subject){

    }
    private Talks getTalk(String subject){
        
        return null;
    }
    public List<Talks> getTalks(){
        return new ArrayList<>(userTalksMap.values());
    }
}
