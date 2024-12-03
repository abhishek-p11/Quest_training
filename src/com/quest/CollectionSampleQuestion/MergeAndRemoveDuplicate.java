package com.quest.CollectionSampleQuestion;

import java.util.ArrayList;
import java.util.List;

public class MergeAndRemoveDuplicate {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        list2.add("Banana");
        list2.add("Date");
        list2.add("Apple");

        List<String> mergedList = mergeAndRemoveDuplicates(list1, list2);

        System.out.println("Merged list without duplicates: " + mergedList);
    }

    public static List<String> mergeAndRemoveDuplicates(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>(list1);

        for (String item : list2) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }
        return mergedList;
    }
}
