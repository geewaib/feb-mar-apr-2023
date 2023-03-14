package com.herbalife.dbday10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class PersonsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void printPersonsWithAgeGt(int age) {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_sel_persons_with_age_gt");
        simpleJdbcCall.declareParameters(new SqlParameter("age_param", Types.INTEGER));
        Map<String, Object> resultMap = simpleJdbcCall.execute(age);
        resultMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            if(value instanceof ArrayList) {
                ((ArrayList<?>) value).forEach(System.out::println);
            }
        });
    }

    public List<String> getFirstNames() {
        String query = "select first_name from persons";
        return jdbcTemplate.queryForList(query, String.class);
    }

    public List<Person> getAllPersons() {
        String query = "select * from persons";
        //Similar to stream API map() method where you transform item to a particular type and the result is a list
        List<Person> persons = jdbcTemplate.query(query, (ResultSet rs, int rowNum) -> {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setFirstName(rs.getString("first_name"));
            person.setLastName(rs.getString("last_name"));
            person.setAge(rs.getInt("age"));
            return person;
        });
        return persons;
    }

    public List<Map<String, Object>> getAll() {
        String query = "select * from persons";
        return jdbcTemplate.queryForList(query);
    }

    public void updateAge(int id, int age) {
        String query = "update persons set age = ? where id = ?";
        jdbcTemplate.update(query, age, id);
    }

    public void insertPerson(String firstName, String lastName, int age) {
        String query = "insert into persons(first_name, last_name, age) values(?,?,?)";
        jdbcTemplate.update(query, firstName, lastName, age);
    }
}
