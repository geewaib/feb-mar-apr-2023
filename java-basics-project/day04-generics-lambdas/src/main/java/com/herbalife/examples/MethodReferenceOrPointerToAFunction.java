package com.herbalife.examples;

public class MethodReferenceOrPointerToAFunction {
    public static void main(String[] args) {

        Worker coder = () -> System.out.println("Writing Java code");
        coder.work();

        Worker singer = () -> System.out.println("Singing");
        singer.work();

        Worker player = MethodReferenceOrPointerToAFunction::playGolf;
        player.work();

        Cricketer virat = new Cricketer();
        Worker player2 = virat::playCricket;
        player2.work();

    }
    static void playGolf() {
        System.out.println("Playing Golf");
    }
}
class Cricketer {
    public void playCricket() {
        System.out.println("Batting");
    }
}

@FunctionalInterface
interface Worker {
    void work();
}
