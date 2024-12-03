package com.quest.CollectionSampleQuestion;
import java.util.*;

public class FirstDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2, 5, 3, 6);

        System.out.println("Input List: " + numbers);

        Integer firstDuplicate = findFirstDuplicate(numbers);

        if (firstDuplicate != null) {
            System.out.println("First duplicate number: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public static Integer findFirstDuplicate(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            if (seen.contains(number)) {
                return number;
            }
            seen.add(number);
        }

        return null;
    }
}

