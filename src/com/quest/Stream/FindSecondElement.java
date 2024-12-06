package com.quest.Stream;

import java.util.*;
import java.util.stream.Stream;

public class FindSecondElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,8,3,9,4,0,2);
        Stream<Integer> stream = list.stream();
           Optional<Integer>  n=stream.distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
           System.out.println(n);

    }
}
