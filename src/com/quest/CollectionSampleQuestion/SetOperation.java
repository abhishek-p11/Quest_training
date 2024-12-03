package com.quest.CollectionSampleQuestion;
import java.util.*;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union of Set 1 and Set 2: " + union);
        System.out.println("Intersection of Set 1 and Set 2: " + intersection);
        System.out.println("Difference of Set 1 and Set 2 (Set1 - Set2): " + difference);
    }
}

