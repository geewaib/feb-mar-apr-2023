package com.herbalife.examples;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapStream {
    public static void main(String[] args) {
        Map<String, List<String>> countryCitiesMap = new HashMap();
        countryCitiesMap.put("India", Arrays.asList("Mumbai", "Delhi", "Chennai"));
        countryCitiesMap.put("US", Arrays.asList("NYC", "Houston", "Fairfax"));
        countryCitiesMap.put("England", Arrays.asList("London", "Bristol", "Essex"));

        //[[...], [...], [...]] (flatMap) [.........]
        countryCitiesMap
                .values()
                .stream()
                //.flatMap(cities -> cities.stream()) //flattened the list of lists[[...],[...],[...]] to a single list [....]
                .flatMap(Collection::stream) //flattened the list of lists[[...],[...],[...]] to a single list [....]
                .map(String::toUpperCase)
                .forEach(System.out::println);



//        countryCitiesMap
//                .values()
//                .stream()
//                .map(cities -> {
//                    return cities
//                            .stream()
//                            .map(city -> city.toUpperCase())
//                            .collect(Collectors.toList());
//                })
//                .forEach(it -> System.out.println(it));
    }
}
