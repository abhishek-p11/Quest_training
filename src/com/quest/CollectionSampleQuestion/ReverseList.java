package com.quest.CollectionSampleQuestion;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of the list:");
            int n = scanner.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            reverseList(list);

            System.out.println("Reversed list:");
            for (int num : list) {
                System.out.print(num + " ");
            }
        }

        public static void reverseList(ArrayList<Integer> list) {
            int start = 0;
            int end = list.size() - 1;

            while (start < end) {
                int temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }
    }
