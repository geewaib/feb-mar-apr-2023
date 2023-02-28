package com.herbalife.examples;

public class InheritanceMain {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle();
        Manager m = new Manager(1212L, "Sam", 3);
        System.out.println(m.getName());
        m.work(8);

        Employee emp = new Manager(122L, "Ram", 3);
        emp.work(12);
    }
}
