package com.herbalife.springbootlab04jpa.repository;

import com.herbalife.springbootlab04jpa.entity.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementRepository extends JpaRepository<Statement, Integer> {
}
