package com.alekea;

import com.alekea.adapter.TalksAdapter;
import com.alekea.dao.TalksRepo;
import com.alekea.model.Talks;
import com.alekea.model.User;
import com.alekea.service.TalkService;

/**
 * Created by Prince on 01.12.2016.
 */
public class Dummy {
    public static void main(String[] args) {
        User user = new User("Prince","Android");
        User user1 = new User("Iyed","Java");

        Talks talk = new Talks("recyclerview","list view",user);
        Talks talk1 = new Talks("rxjava","reactive",user1);

        TalksRepo talksRepo = new TalksRepo();
        talksRepo.addTalk(talk);
        talksRepo.addTalk(talk1);

        TalksAdapter adapter = new TalksAdapter(talksRepo);

        TalkService talkService = new TalkService(adapter);
        talkService.registerRoutes();

    }

}
