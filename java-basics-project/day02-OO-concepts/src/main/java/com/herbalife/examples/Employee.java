package com.herbalife.examples;

public class Employee {
    private long id;
    private String name;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public final void logTimesheet() {

    }

    public void work(int hours) {
        System.out.println("Employee " + this.name + " works " + hours + " hours");
    }
}
