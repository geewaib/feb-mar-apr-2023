package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class DeclarativeVsImperativeStyle {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Golang", "JavaScript", "Scala", "Ruby", "TS");
        //Print the languages that begin with J

        //Imperative style (Write code and say what to do and also how to do)
        //Difficult to parallelize this code say for 10000 languages
        //Data is getting scattered all over
        //Readability
        for (int i = 0; i < languages.size(); i++) {
            String language = languages.get(i);
            if(language.startsWith("J")) {
                System.out.println(language);
            }
        }

        //Declarative style (Write code and say what to do)
        //Easy to parallelize the code
        //Promotes Immutability
        //Reads seamlessly
        //chaining functions
        //Functional style of coding
        languages
                .stream()
                //.parallel()
                .filter(lang -> lang.startsWith("J"))
                .forEach(System.out::println);
    }
}
