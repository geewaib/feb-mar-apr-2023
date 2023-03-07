package com.herbalife.labs.lab10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab10 {
    static List<String> fileLines;

    public static void main(String[] args) throws IOException {
        fileLines = Files.readAllLines(Paths.get("./cities.csv"));
        extractAndStoreAllTheDistinctNames("./cities.txt", line -> line.split(",")[0]);
        extractAndStoreAllTheDistinctNames("./countries.txt", line -> line.split(",")[1]);
        printAllCitiesGroupedByCountry();
        printTheNamesOfAllTheCities();
        generateJson();
    }

    private static String generateJsonItem(String line) {
        String[] items = line.split(",");
        String city = items[0];
        String country = items[1];
        long population = Long.parseLong(items[2]);

        StringBuilder jsonBuilder = new StringBuilder("");
        jsonBuilder.append("{");
        jsonBuilder.append("\"city\": ");
        jsonBuilder.append("\"");
        jsonBuilder.append(city);
        jsonBuilder.append("\", ");
        jsonBuilder.append("\"country\": ");
        jsonBuilder.append("\"");
        jsonBuilder.append(country);
        jsonBuilder.append("\", ");
        jsonBuilder.append("\"population\": ");
        jsonBuilder.append(population);
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    private static void generateJson() throws IOException {
        String json = fileLines
                .stream()
                .skip(1)
                .map(Lab10::generateJsonItem)
                .collect(Collectors.joining(", " + System.lineSeparator(), "{ \"places\": [" + System.lineSeparator(), "]" + System.lineSeparator() + "}"));
        Files.write(Paths.get("./places.json"), json.getBytes());
    }

    private static void printTheNamesOfAllTheCities() {
        //resume driven development: I want to use flatMap
        fileLines
                .stream()
                .skip(1)
                .collect(Collectors.groupingBy(line -> line.split(",")[1]))
                .values()
                .stream()
                .flatMap(Collection::stream)
                .map(line -> line.split(",")[0])
                .distinct()
                .forEach(System.out::println);


//        fileLines
//                .stream()
//                .skip(1)
//                .map(line -> line.split(",")[0])
//                .distinct()
//                .forEach(System.out::println);
    }

    private static void printAllCitiesGroupedByCountry() {
        Map<String, List<String>> countryCitiesMap = fileLines
                .stream()
                .skip(1)
                .collect(Collectors.groupingBy(line -> line.split(",")[1]));
        countryCitiesMap.forEach((country, value) -> {
            System.out.println("***** " + country + " *****");
            value.forEach(System.out::println);
            System.out.println();
        });
    }

    private static void extractAndStoreAllTheDistinctNames(String fileName, Function<String, String> mapFn) throws IOException {
        List<String> items = fileLines
                .stream()
                .skip(1)
                .map(mapFn)
                .distinct()
                .collect(Collectors.toList());
        Files.write(Paths.get(fileName), items);
    }


}
