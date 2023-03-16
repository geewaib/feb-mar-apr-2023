package com.herbalife.jpamoreconceptsday12;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query(value = "select c from Car c join fetch c.owner where c.id = :id")
    Car loadCarWithOwnerInformation(@Param("id") int id);
}
