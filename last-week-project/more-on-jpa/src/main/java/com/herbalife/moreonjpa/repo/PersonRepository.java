package com.herbalife.moreonjpa.repo;

import com.herbalife.moreonjpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
