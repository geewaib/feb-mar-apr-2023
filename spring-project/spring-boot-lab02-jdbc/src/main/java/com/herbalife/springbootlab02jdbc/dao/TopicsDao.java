package com.herbalife.springbootlab02jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TopicsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
