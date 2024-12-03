package com.quest.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);

        System.out.println(list.stream().findFirst().get());
        //System.out.println(list.stream().distinct());
        System.out.println(list.stream().findAny().get());
        System.out.println("max:"+list.stream().max(Integer::compareTo).get());
        System.out.println("min:"+list.stream().min(Integer::compareTo).get());
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("max:"+max.get());
        System.out.println("count:"+list.stream().count());
        System.out.println("distinct:"+list.stream().distinct().count());
        System.out.println(list.stream().reduce(2, Integer::sum));

        List<Integer> list2 = list.stream().filter(i -> i%2==0).toList();
        System.out.println("list2:"+list2);

        List<Integer> list3 = list.stream().map(i -> i*2).toList();
        System.out.println("list3:"+list3);

        int c = list.stream().map(i -> i*2).max(Integer::compareTo).get();
        System.out.println("c:"+c);


    }
}