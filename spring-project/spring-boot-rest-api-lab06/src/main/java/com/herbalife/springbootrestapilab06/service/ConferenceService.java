package com.herbalife.springbootrestapilab06.service;

import com.herbalife.springbootrestapilab06.entity.Topic;
import com.herbalife.springbootrestapilab06.exception.TopicAlreadyExistsException;
import com.herbalife.springbootrestapilab06.exception.TopicNotFoundException;
import com.herbalife.springbootrestapilab06.repository.TopicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ConferenceService {
    @Autowired
    private TopicRepository topicRepository;

    public boolean addTopic(String title, int duration) {
        Optional<Topic> optionalTopic = topicRepository.findByTitle(title);
        if (optionalTopic.isEmpty()) {
            Topic topic = new Topic();
            topic.setTitle(title);
            topic.setDuration(duration);
            topicRepository.save(topic);
            log.info("Topic with title {} created", title);
            return true;
        } else {
            throw new TopicAlreadyExistsException(title);
        }
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public boolean removeTopic(String title) {
        Optional<Topic> optionalTopic = topicRepository.findByTitle(title);
        if (optionalTopic.isPresent()) {
            Topic topic = optionalTopic.get();
            topicRepository.delete(topic);
            log.info("Topic with title {} deleted", title);
            return true;
        } else {
            throw new TopicNotFoundException(title);
        }
    }

    public boolean updateDuration(String title, int duration) {
        Optional<Topic> optionalTopic = topicRepository.findByTitle(title);
        if (optionalTopic.isPresent()) {
            Topic topic = optionalTopic.get();
            topic.setDuration(duration);
            topicRepository.save(topic);
            log.info("Duration for topic with title {} updated to {}", title, duration);
            return true;
        } else {
            throw new TopicNotFoundException(title);
        }
    }
}
