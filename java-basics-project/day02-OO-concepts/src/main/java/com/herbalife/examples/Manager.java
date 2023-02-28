package com.herbalife.examples;

//public class Manager : Employee {}
public class Manager extends Employee {
    private int level;

    //public Manager(long id, String name, int level) : base(id, name) {}
    public Manager(long id, String name, int level) {
        super(id, name); //base
        this.level = level;
    }

    //@Override
    public void work(int hours) {
        System.out.println("Manager: " + this.getName() + " works for " + hours + " hours");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
