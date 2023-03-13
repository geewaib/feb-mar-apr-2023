package com.herbalife.springbootbasicsday09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//<bean id="address" ... />
@Component
public class Address {
    @Value("Bengaluru")
    private String city;
    @Value("India")
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
