package com.labs.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Conference {

    @Autowired
    private SessionPlannerUsingMap sessionPlannerUsingMap;

    @Autowired
    private SessionPlanner sessionPlanner;

    public Map<Integer, List<String>> getTopicDurationMap() {
        return sessionPlannerUsingMap.getTopics();
    }

    public List<Topic> getAllTopics() {
        return sessionPlanner.getTopics();
    }
}
