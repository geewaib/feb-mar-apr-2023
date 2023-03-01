package com.herbalife.labs.lab06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lab06 {
    private static String filePath = "./cities.csv";
    private static Map<String, List<City>> citiesMap = new HashMap<>();
    private static List<String> linesInCsvFile;

    public static void main(String[] args) throws IOException {
        linesInCsvFile = Files.readAllLines(Paths.get(filePath));
        linesInCsvFile.remove(0);
        populateCitiesMap();
        printAllTheCitiesGroupedByCountries();
        printTheCityNameWithLargestAndSmallestPopulation();
        printPopulationOf("China");
    }

    private static void printPopulationOf(String country) {
        List<City> cities = citiesMap.get(country);
        double totalPopulation = 0;
        for (City city : cities) {
            totalPopulation += city.getPopulation();
        }
        System.out.println(String.format("Population of %s is %s", country, totalPopulation));
    }

    private static void printTheCityNameWithLargestAndSmallestPopulation() {
        City largestCity = null;
        City smallestCity = null;
        for (List<City> cities : citiesMap.values()) {
            for (City city : cities) {
                if (smallestCity == null) {
                    smallestCity = city;
                }
                if (largestCity == null) {
                    largestCity = city;
                }
                if (city.getPopulation() > largestCity.getPopulation()) {
                    largestCity = city;
                }
                if (city.getPopulation() < smallestCity.getPopulation()) {
                    smallestCity = city;
                }
            }
        }
        System.out.println("Smallest city: " + smallestCity);
        System.out.println("Largest city: " + largestCity);
    }

    private static void printAllTheCitiesGroupedByCountries() {
        Set<String> countries = citiesMap.keySet();
        for (String country : countries) {
            List<City> cities = citiesMap.get(country);
            System.out.println("---" + country + "---");
            cities.forEach(System.out::println);
        }
    }


    private static void populateCitiesMap() {
        for (String csvItem : linesInCsvFile) {
            String items[] = csvItem.split(",");
            City city = new City(items[0], Long.parseLong(items[2]));
            String country = items[1];
            if (!citiesMap.containsKey(country)) {
                citiesMap.put(country, new ArrayList<>());
            }
            citiesMap.get(country).add(city);
        }
    }
}
