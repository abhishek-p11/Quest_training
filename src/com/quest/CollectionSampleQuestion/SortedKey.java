package com.quest.CollectionSampleQuestion;
import java.util.*;
public class SortedKey {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Orange", 3);
        unsortedMap.put("Grapes", 4);

        System.out.println("Unsorted Map:");
        printMap(unsortedMap);

        Map<String, Integer> sortedMap = sortByKeys(unsortedMap);

        System.out.println("\nSorted Map by Keys:");
        printMap(sortedMap);
    }


    public static Map<String, Integer> sortByKeys(Map<String, Integer> map) {
        return new TreeMap<>(map);
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
