package com.herbalife.springbootlab02jdbc.dao;

import com.herbalife.springbootlab02jdbc.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static com.herbalife.springbootlab02jdbc.constants.Queries.*;

import java.util.List;

@Repository
public class TopicsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getTopicsCount(String title) {
        int count = jdbcTemplate.queryForObject(SELECT_TOPIC_COUNT_BY_TITLE, Integer.class, title);
        return count;
    }

    public void createTopic(String title, int duration) {
        jdbcTemplate.update(INSERT_TOPIC, title, duration);
    }

    public List<Topic> getAllTopics() {
        List<Topic> topics = jdbcTemplate.query(SELECT_ALL_TOPICS, (rs, rowNum) -> {
            Topic topic = new Topic();
            topic.setId(rs.getInt("id"));
            topic.setTitle(rs.getString("title"));
            topic.setDuration(rs.getInt("duration"));
            return topic;
        });
        return topics;
    }

    public void removeTopic(String title) {
        jdbcTemplate.update(DELETE_TOPIC_BY_TITLE, title);
    }
}
