package com.herbalife.springbootlab04jpa;

import com.herbalife.springbootlab04jpa.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLab04JpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLab04JpaApplication.class, args);
    }

    @Autowired
    private BankService bankService;

    @Override
    public void run(String... args) throws Exception {
//        bankService.deposit("acc101", 1000, "Gift");
//        bankService.deposit("acc101", 100, "Dividend");
//        bankService.deposit("acc101", 101000, "Salary");
//        bankService.withdraw("acc101", 10, "Interest");

        bankService.printStatement("acc101").forEach(System.out::println);
    }
}
