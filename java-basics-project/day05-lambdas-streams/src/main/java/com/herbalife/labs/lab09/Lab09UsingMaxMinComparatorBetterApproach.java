package com.herbalife.labs.lab09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lab09UsingMaxMinComparatorBetterApproach {
    static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

    public static void main(String[] args) {
        generateNewListContainingTheNamesOfAllTheItems();
        concatAllItemNamesInCsv();

        Item costliestItem = items
                .stream()
                .max((item1, item2) -> (int)(item1.getPrice() - item2.getPrice()))
                .get();
        System.out.println("Costliest item: " + costliestItem.getName());

        Item cheapestItem = items
                .stream()
                .min((item1, item2) -> (int)(item1.getPrice() - item2.getPrice()))
                .get();
        System.out.println("Cheapest item: " + cheapestItem.getName());

    }


    private static void concatAllItemNamesInCsv() {
        String csv = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.joining(", "));
        System.out.println(csv);
    }


    private static void generateNewListContainingTheNamesOfAllTheItems() {
        List<String> names = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }

}
