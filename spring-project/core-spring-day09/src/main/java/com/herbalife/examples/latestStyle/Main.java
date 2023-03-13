package com.herbalife.examples.latestStyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans-latest-style.xml");
        Person person = context.getBean("person", Person.class);
        person.workFromHome();

        Company company = context.getBean("company", Company.class);
        System.out.println(company);

        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
