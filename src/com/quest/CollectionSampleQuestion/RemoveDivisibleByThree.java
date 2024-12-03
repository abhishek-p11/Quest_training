package com.quest.CollectionSampleQuestion;
import java.util.*;
public class RemoveDivisibleByThree {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 3, 6, 7, 9, 10, 12, 15));

        System.out.println("Original Set: " + numbers);


        numbers.removeIf(num -> num % 3 == 0);

        System.out.println("Updated Set : " + numbers);
    }
}