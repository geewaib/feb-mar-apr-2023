package com.herbalife.examples;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenericTypesExample {
    public static void main(String[] args) {
        //MyCollection<String> words = new MyCollection<>();
        //words.add("ABC");

       // MyCollection<Integer> primeNumbers = new MyCollection<>();
        //primeNumbers.add(1);

        MyCollection<DVD> dvdMyCollection = new MyCollection<>();
        dvdMyCollection.add(new DVD());

        //A function whose input is a derived class of Entertainment and the output is any Type
        Function<? super Entertainment, ?> wthIsThis = data -> "12";
        System.out.println(wthIsThis.apply(new DVD()));
        List<? super Entertainment> dvdList = new ArrayList<>();
        dvdList.add(new DVD());
        dvdList.add(new BlueRayDisc());
        //dvdList.add(new String(""));
        //dvdList.add(120);


    }
}
abstract class Entertainment {}
class DVD extends Entertainment {}
class BlueRayDisc extends Entertainment {}



class MyCollection<T extends Entertainment> {
    private List<T> items = new ArrayList<>();

    public void add(T t) {
        items.add(t);
    }
}

