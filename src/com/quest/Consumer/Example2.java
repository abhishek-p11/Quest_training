package com.quest.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
         System.out.println("predicate example");
        Predicate<Integer> predicate = x -> x % 2 == 0;
        list.forEach(x ->{
            if(predicate.test(x))
                System.out.println(x);
        });
        Consumer<List<Integer>> multiplyByTwo = (list1)-> {
            for (int i = 0; i < list1.size(); i++) {
                list1.set(i, list1.get(i) * 2);
            }
        };
        List<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (num%2==0) {
                filteredList.add(num);
            }
        }
        multiplyByTwo.accept(filteredList);
        Supplier<List<Integer>> transformedListSupplier = () -> filteredList;

        List<Integer> transformedList = transformedListSupplier.get();
        System.out.println("Transformed List: " + transformedList);

    }
}
