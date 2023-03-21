package com.herbalife.springbootrestapilab06.repository;

import com.herbalife.springbootrestapilab06.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
    Optional<Topic> findByTitle(String title);
}
