package com.herbalife.labs.lab10;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab10Json {
    static List<String> fileLines;

    public static void main(String[] args) throws IOException {
        fileLines = Files.readAllLines(Paths.get("./cities.csv"));
        List<Place> places = extractPlaces();
        Gson gson = new Gson();
        String json = gson.toJson(places);
        Files.write(Paths.get("./places2.json"), json.getBytes());
    }

    private static List<Place> extractPlaces() {
        return fileLines
                .stream()
                .skip(1)
                .map(Lab10Json::generatePlace)
                .collect(Collectors.toList());
    }

    private static Place generatePlace(String line) {
        String[] items = line.split(",");
        Place place = new Place();
        place.setCity(items[0]);
        place.setCountry(items[1]);
        place.setPopulation(Long.parseLong(items[2]));
        return place;
    }

}
