package com.herbalife.springbootmorebasicsday11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    //@Value("Ram")
    private String name;

    //@Autowired
    private Address residenceAddress;

    //Personally, this is not my favorite. I prefer field based injection
    public Person(@Value("Ram") String name, @Autowired Address residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(Address residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
