package com.quest.CollectionSampleQuestion;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        System.out.println("Original List: " + list);

        Set<String> set = new HashSet<>(list);

        System.out.println("Set without duplicates: " + set);
    }
}

