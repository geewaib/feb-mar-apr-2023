package com.herbalife.springbootlab02jdbc.service;

import com.herbalife.springbootlab02jdbc.dao.TopicsDao;
import com.herbalife.springbootlab02jdbc.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConferenceService {
    @Autowired
    private TopicsDao topicsDao;

    public boolean addTopic(String title, int duration) {
        //true if succesfully inserted
        //false if insertion fails
        //Do not allow duplicate topics
    }

    public List<Topic> getAllTopics() {

    }

    public boolean removeTopic(String title) {
        //Throw NotFoundException if the topic doesn't exist
    }
}
