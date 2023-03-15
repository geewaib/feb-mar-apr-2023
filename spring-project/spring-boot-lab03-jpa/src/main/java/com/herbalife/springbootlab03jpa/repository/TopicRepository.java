package com.herbalife.springbootlab03jpa.repository;

import com.herbalife.springbootlab03jpa.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
    Optional<Topic> findByTitle(String title);
}
