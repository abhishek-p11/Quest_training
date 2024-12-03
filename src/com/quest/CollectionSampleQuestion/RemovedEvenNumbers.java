package com.quest.CollectionSampleQuestion;
import java.util.ArrayList;
import java.util.Scanner;
public class RemovedEvenNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of the list:");
            int n = scanner.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();
            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }

            ArrayList<Integer> updatedList = removeEvenNumbers(numbers);

            System.out.println("Updated list after removing even numbers: " + updatedList);
        }

        public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int num : list) {
                if (num % 2 != 0) {
                    result.add(num);
                }
            }
            return result;
        }
    }

