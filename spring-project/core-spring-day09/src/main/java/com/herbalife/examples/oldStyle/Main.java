package com.herbalife.examples.oldStyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Person sam = PersonFactory.getPerson("Sam Thomas", 34, "KL", "Malaysia");
//        sam.workFromHome();
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:beans.xml");
        Person person = context.getBean("person1", Person.class);
        person.workFromHome();
        Person person2 = context.getBean("person2", Person.class);
        person2.workFromHome();
    }
}
