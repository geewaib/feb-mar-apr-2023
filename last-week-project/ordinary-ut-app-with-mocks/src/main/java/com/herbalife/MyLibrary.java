package com.herbalife;

import java.util.ArrayList;
import java.util.List;

public class MyLibrary {
    private List<Integer> numbers = new ArrayList<>();

    public void add(int num) {
        if(numbers.contains(num)) {
            throw new RuntimeException("Number " + num + " is already present");
        }
        numbers.add(num);
    }

    public int getNum(int index) {
        return numbers.get(index);
    }

    public int size() {
        return numbers.size();
    }
}