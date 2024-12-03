package com.quest.CollectionSampleQuestion;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 15);

        Integer secondLargest = findSecondLargest(numbers);
        System.out.println(secondLargest != null ? "The second-largest number is: " + secondLargest : "No second largest element.");
    }

    public static Integer findSecondLargest(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        if (uniqueNumbers.size() < 2) {
            return null;
        }
        List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size() - 2);
    }
}

