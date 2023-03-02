package com.herbalife.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericTypesExample {
    public static void main(String[] args) {
        MyCollection<Integer> evenNumbersCollection = new MyCollection<>();
        evenNumbersCollection.add(10);
        evenNumbersCollection.add(20);
        evenNumbersCollection.add(30);
//        evenNumbersCollection.add("30");

        MyCollection<String> hobbiesCollection = new MyCollection<>();
        hobbiesCollection.add("TV");
        hobbiesCollection.add("Eat");
        hobbiesCollection.add("Sleep");

        MyCollection<Book> booksCollection = new MyCollection<>();
        booksCollection.add(new Book());

        MyCollection<Book> sciFiBooksCollection = new MyCollection<>();
        sciFiBooksCollection.add(new Book());
        System.out.println(MyCollection.count);

    }
}

class MyCollection<T> {
    private List<T> items = new ArrayList<>();
    public static int count;

    public MyCollection() {
        count++;
    }

    public void add(T item) {
        items.add(item);
    }
}
class Book {}