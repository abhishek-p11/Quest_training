package com.quest.Phase2Test.Phase2Test2;
import java.util.*;

public class GroupedByFrequency {
    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> numbers) {
        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                // Increment the count if the number is already in the map
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                // Add the number to the map with a count of 1
                frequencyMap.put(number, 1);
            }
        }
        // Group numbers by their frequency
        Map<Integer, List<Integer>> groupedByFrequency = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            // Check if the frequency key is already in the map
            if (!groupedByFrequency.containsKey(frequency)) {
                groupedByFrequency.put(frequency, new ArrayList<>());
            }

            // Add the number to the list for its frequency
            groupedByFrequency.get(frequency).add(number);
        }

        return groupedByFrequency;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3,4);
        Map<Integer, List<Integer>> result = groupByFrequency(numbers);
        System.out.println("Grouped by frequency: " + result);
    }
}

