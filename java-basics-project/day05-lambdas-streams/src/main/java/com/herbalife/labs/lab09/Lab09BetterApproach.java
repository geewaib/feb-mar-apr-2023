package com.herbalife.labs.lab09;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lab09BetterApproach {
    static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

    public static void main(String[] args) {
        generateNewListContainingTheNamesOfAllTheItems();

        Item costliestItem = getItemOf((prevItem, currentItem) -> prevItem.getPrice() > currentItem.getPrice() ? prevItem : currentItem);
        System.out.println("Costliest item: " + costliestItem.getName());
        Item cheapestItem = getItemOf((prevItem, currentItem) -> prevItem.getPrice() < currentItem.getPrice() ? prevItem : currentItem);
        System.out.println("Cheapest item: " + cheapestItem.getName());

        concatAllItemNamesInCsv();
    }

    private static void concatAllItemNamesInCsv() {
        String csv = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.joining(", "));
        System.out.println(csv);
    }

    private static Item getItemOf(BinaryOperator<Item> binaryOperator) {
        final Item item = items
                .stream()
                .reduce(binaryOperator)
                .get();
        return item;
    }

    private static void generateNewListContainingTheNamesOfAllTheItems() {
        List<String> names = items
                .stream()
                .map(it -> it.getName())
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }

}
