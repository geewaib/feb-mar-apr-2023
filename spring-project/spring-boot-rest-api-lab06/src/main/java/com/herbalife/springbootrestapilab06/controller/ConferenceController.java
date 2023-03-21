package com.herbalife.springbootrestapilab06.controller;

import com.herbalife.springbootrestapilab06.dto.TopicInput;
import com.herbalife.springbootrestapilab06.entity.Topic;
import com.herbalife.springbootrestapilab06.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//DO NOT USE VERBS IN URL ex: /add, /remove, /update, /create, /get
@RestController
@RequestMapping("/conference/topics")
public class ConferenceController {
    @Autowired
    private ConferenceService conferenceService;

    @PostMapping
    public HttpEntity<Void> addTopic(@RequestBody TopicInput topicInput) {
        conferenceService.addTopic(topicInput.getTitle(), topicInput.getDuration());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public HttpEntity<List<Topic>> getAllTopics() {
        List<Topic> topics = conferenceService.getAllTopics();
        return new ResponseEntity<>(topics, HttpStatus.OK);
    }

    @DeleteMapping("/title/{title}")
    public HttpEntity<Void> removeTopic(@PathVariable String title) {
        conferenceService.removeTopic(title);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping
    public HttpEntity<Void> updateDuration(@RequestBody TopicInput topicInput) {
        conferenceService.updateDuration(topicInput.getTitle(), topicInput.getDuration());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
