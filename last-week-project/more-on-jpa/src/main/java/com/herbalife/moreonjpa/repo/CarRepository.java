package com.herbalife.moreonjpa.repo;

import com.herbalife.moreonjpa.entity.Car;
import com.herbalife.moreonjpa.entity.CarCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, CarCompositeKey> {
}
