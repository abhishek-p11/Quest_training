package com.quest.CollectionSampleQuestion;
import java.util.*;
public class FirstDuplicateFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            System.out.println("Enter the numbers:");
            int[] input = new int[10];
            for (int i = 0; i < n; i++) {
                input[i] = scanner.nextInt();
            }

            Set<Integer> seen = new HashSet<>();
            Integer firstDuplicate = null;


            for (int number : input) {

                if (seen.contains(number)) {
                    firstDuplicate = number;
                    break;
                }
                seen.add(number);
            }

            if (firstDuplicate != null) {
                System.out.println("The first duplicate number is: " + firstDuplicate);
            } else {
                System.out.println("No duplicates found.");
            }
        }
    }

