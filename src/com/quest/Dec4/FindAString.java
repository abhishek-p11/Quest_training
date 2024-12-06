package com.quest.Dec4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindAString {
    public static void main(String[] args) {
        String filePath ="file2.txt";
        String searchString = "hello";

        try (FileReader fileReader = new FileReader(filePath)) {
            StringBuilder fileContent = new StringBuilder();
            int character;

            // Read the file character by character and append to the StringBuilder
            while ((character = fileReader.read()) != -1) {
                fileContent.append((char) character);
            }

            // Check if the file content contains the search string
            if (fileContent.toString().contains(searchString)) {
                System.out.println("'" + searchString + "' was found in the file.");
            } else {
                System.out.println("'" + searchString + "' was not found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}



