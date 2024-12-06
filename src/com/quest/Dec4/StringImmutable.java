package com.quest.Dec4;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "Java Programming";

        // Attempting to modify the string using substring
        String str2 = str1.substring(0, 4);

        // Print the original and new strings
        System.out.println("Original String: " + str1);
        System.out.println("New String: " + str2);
    }
}
