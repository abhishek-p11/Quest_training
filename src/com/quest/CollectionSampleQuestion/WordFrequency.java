package com.quest.CollectionSampleQuestion;
import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();


        String[] words = input.toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


            System.out.println("Word frequencies:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
