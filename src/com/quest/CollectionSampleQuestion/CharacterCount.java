package com.quest.CollectionSampleQuestion;

import java.util.*;

public class CharacterCount
{
    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Input String: " + input);

        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }
}

