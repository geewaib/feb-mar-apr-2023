package com.herbalife.examples;

public class EvolutionToLambda {
    public static void main(String[] args) {
        Greetings greetings = new GreetingsImpl();
        greetings.hello("Sam");

        //Anonymous inner class: EvolutionToLambda$1.class
        Greetings greetingsAnon = new Greetings() {
            public void hello(String name) {
                System.out.println("Hi " + name);
            }
        };
        greetingsAnon.hello("Sam");

        //Lambda expressions are anonymous inner classes generated during runtime
        Greetings greetingsLambda = name -> System.out.println("Hey " + name);
        greetingsLambda.hello("Sam");
        System.out.println(greetingsLambda.getClass().getName());
    }
}

@FunctionalInterface
interface Greetings {
    void hello(String name);
    //void bye(String name);
    default void greet(String name) {}
}

class GreetingsImpl implements Greetings {
    public void hello(String name) {
        System.out.println("Hello " + name);
    }
}