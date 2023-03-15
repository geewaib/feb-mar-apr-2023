package com.herbalife.springbootlab02jdbc.service;

import com.herbalife.springbootlab02jdbc.dao.TopicsDao;
import com.herbalife.springbootlab02jdbc.entity.Topic;
import com.herbalife.springbootlab02jdbc.exception.TopicExistsException;
import com.herbalife.springbootlab02jdbc.exception.TopicNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {

    @Autowired
    private TopicsDao topicsDao;

    public boolean addTopic(String title, int duration) {
        int count = topicsDao.getTopicsCount(title);
        if (count > 0) {
            throw new TopicExistsException(title);
        } else {
            topicsDao.createTopic(title, duration);
        }
        return true;
    }

    public List<Topic> getAllTopics() {
        return topicsDao.getAllTopics();
    }

    public boolean removeTopic(String title) {
        int count = topicsDao.getTopicsCount(title);
        if (count > 0) {
            topicsDao.removeTopic(title);
        } else {
            throw new TopicNotFoundException(title);
        }
        return true;
    }
}
