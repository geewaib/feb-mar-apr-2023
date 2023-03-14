package com.herbalife.dbday10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateAge(int id, int age) {
        String query = "update persons set age = ? where id = ?";
        jdbcTemplate.update(query, age, id);
    }

    public void insertPerson(String firstName, String lastName, int age) {
        String query = "insert into persons(first_name, last_name, age) values(?,?,?)";
        jdbcTemplate.update(query, firstName, lastName, age);
    }
}
