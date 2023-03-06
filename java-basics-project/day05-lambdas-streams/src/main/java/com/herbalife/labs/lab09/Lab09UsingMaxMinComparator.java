package com.herbalife.labs.lab09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lab09UsingMaxMinComparator {
    static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

    public static void main(String[] args) {
        generateNewListContainingTheNamesOfAllTheItems();
        concatAllItemNamesInCsv();

        Item costliestItem = items
                .stream()
                .max(compareItems())
                .get();
        System.out.println("Costliest item: " + costliestItem.getName());

        Item cheapestItem = items
                .stream()
                .min(compareItems())
                .get();
        System.out.println("Cheapest item: " + cheapestItem.getName());

    }

    private static Comparator<Item> compareItems() {
        return (item1, item2) -> {
            if (item1.getPrice() > item2.getPrice()) {
                return 1;
            } else if (item1.getPrice() < item2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        };
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
