package com.herbalife.labs.lab09;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lab09 {
    static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

    public static void main(String[] args) {
        generateNewListContainingTheNamesOfAllTheItems();
        printTheNameOfTheCostliestItem();
        printTheNameOfTheCheapestItem();
        concatAllItemNamesInCsv();
    }

    private static void concatAllItemNamesInCsv() {
        String csv = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.joining(", "));
        System.out.println(csv);
    }

    private static void printTheNameOfTheCheapestItem() {
        final Optional<Item> itemOptional = items
                .stream()
                .reduce((prevItem, currentItem) -> prevItem.getPrice() < currentItem.getPrice() ? prevItem : currentItem);
        if (itemOptional.isPresent()) {
            System.out.println("Cheapest item is " + itemOptional.get().getName());
        }
    }

    private static void printTheNameOfTheCostliestItem() {
        final Optional<Item> itemOptional = items
                .stream()
                .reduce((prevItem, currentItem) -> prevItem.getPrice() > currentItem.getPrice() ? prevItem : currentItem);
        if (itemOptional.isPresent()) {
            System.out.println("Costliest item is " + itemOptional.get().getName());
        }
    }

    private static void generateNewListContainingTheNamesOfAllTheItems() {
        List<String> names = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }

}
