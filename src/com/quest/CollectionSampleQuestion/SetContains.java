package com.quest.CollectionSampleQuestion;
import java.util.*;

public class SetContains {
        public static void main(String[] args) {

            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

            boolean containsAll = true;
            for (Integer element : set2) {
                if (!set1.contains(element)) {
                    containsAll = false;
                    break;
                }
            }

            if (containsAll) {
                System.out.println("Set1 contains all the elements of Set2.");
            } else {
                System.out.println("Set1 does not contain all the elements of Set2.");
            }
        }
    }

