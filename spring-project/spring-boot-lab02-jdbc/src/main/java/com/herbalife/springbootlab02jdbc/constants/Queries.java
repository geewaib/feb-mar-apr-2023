package com.herbalife.springbootlab02jdbc.constants;

public interface Queries {
    String INSERT_TOPIC = "insert into topics(title, duration) values(?, ?)";
    String DELETE_TOPIC_BY_TITLE = "delete from topics where title = ?";
    String SELECT_TOPIC_COUNT_BY_TITLE = "select count(*) from topics where title = ?";
    String SELECT_ALL_TOPICS = "select * from topics";
}
