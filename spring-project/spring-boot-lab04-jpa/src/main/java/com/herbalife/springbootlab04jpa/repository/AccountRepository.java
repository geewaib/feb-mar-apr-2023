package com.herbalife.springbootlab04jpa.repository;

import com.herbalife.springbootlab04jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {

    @Query(value = "select a from Account a join fetch a.statements where a.accountNumber = :accountNumber")
    Optional<Account> loadAllStatements(@Param("accountNumber") String accountNumber);
}
