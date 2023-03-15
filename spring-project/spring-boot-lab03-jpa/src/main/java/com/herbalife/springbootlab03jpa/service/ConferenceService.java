package com.herbalife.springbootlab03jpa.service;

import com.herbalife.springbootlab03jpa.entity.Topic;
import com.herbalife.springbootlab03jpa.exception.TopicExistsException;
import com.herbalife.springbootlab03jpa.exception.TopicNotFoundException;
import com.herbalife.springbootlab03jpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ConferenceService {

    @Autowired
    private TopicRepository topicRepository;

    public boolean addTopic(String title, int duration) {
        boolean noTopicExists = getTopicStream()
                .noneMatch(t -> t.getTitle().equals(title));
        if (noTopicExists) {
            Topic topic = new Topic();
            topic.setTitle(title);
            topic.setDuration(duration);
            topicRepository.save(topic);
        } else {
            throw new TopicExistsException(title);
        }
        return true;
    }

    private Stream<Topic> getTopicStream() {
        return topicRepository
                .findAll()
                .stream();
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public boolean removeTopic(String title) {
        Topic existingTopic = getTopicStream()
                .filter(t -> t.getTitle().equals(title))
                .findAny()
                .orElse(null);

        if (existingTopic != null) {
            topicRepository.delete(existingTopic);
        } else {
            throw new TopicNotFoundException(title);
        }
        return true;
    }
}
