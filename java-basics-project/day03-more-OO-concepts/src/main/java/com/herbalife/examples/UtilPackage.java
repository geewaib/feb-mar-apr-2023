package com.herbalife.examples;

import java.util.*;

public class UtilPackage {
    public static void main(String[] args) {
        //List, Set, Map
        //List allows duplications. Preserves order
        List<Integer> arrayList = new ArrayList<>(); //Commonly used
        List<Integer> vector = new Vector<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            System.out.println(num);
        }
        //Set does not allow duplications; does not preserve order
        Set<String> langs = new HashSet<>();
        Set<String> langs2 = new LinkedHashSet<>();
        Set<String> langs3 = new TreeSet<>();
        langs.add("Java");
        langs.add("JS");
        langs.add("Golang");
        langs.add("JS");
        for (String item : langs) {
            System.out.println(item);
        }

        //Map - Dictionary collection
        Map<Integer, String> romanNumerals = new HashMap<>();
        Map<Integer, String> romanNumerals2 = new LinkedHashMap<>();
        Map<Integer, String> romanNumerals3 = new TreeMap<>();
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");
        Set<Integer> romanNumeralKeys = romanNumerals.keySet();
        for (int key : romanNumeralKeys) {
            System.out.println(key + ": " + romanNumerals.get(key));
        }

    }
}
