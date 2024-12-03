package com.quest.Phase2Test.Phase2Test2;
import java.util.*;

public class PartitionList {
    public static List<List<Integer>> partitionList(List<Integer> inputList, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 0) {
            throw new IllegalArgumentException("Partition size must be greater than zero.");
        }
        // Iterate through the input list and partition it
        for (int i = 0; i < inputList.size(); i += n) {
            // Create a sublist from index i to i + n (or end of the list)
            List<Integer> sublist = inputList.subList(i, i+n);
            result.add(new ArrayList<>(sublist)); // Add the sublist to the result
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int partitionSize = 2;

        List<List<Integer>> partitioned = partitionList(inputList, partitionSize);

        System.out.println("Partitioned list: " + partitioned);
    }
}
