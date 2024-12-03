package com.quest.CollectionSampleQuestion;
import java.util.*;

public class WordFrequencyMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.toLowerCase().split(" ");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

