package com.quest.CollectionSampleQuestion;
import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 5, 5, 20, 10, 30);

        countOccurrences(numbers);
    }

    public static void countOccurrences(List<Integer> numbers) {
        List<Integer> counted = new ArrayList<>();
        List<Integer> frequencies = new ArrayList<>();
        for (Integer number : numbers) {
            // If the number hasn't been counted yet
            if (!counted.contains(number)) {
                counted.add(number); // Mark the number as counted
                int frequency = 0;

                // Count how many times this number appears in the list
                for (Integer n : numbers) {
                    if (n.equals(number)) {
                        frequency++;
                    }
                }
                frequencies.add(frequency);
            }
        }
        for (int i = 0; i < counted.size(); i++) {
            System.out.println(counted.get(i) + " -> " + frequencies.get(i));
        }
    }
}