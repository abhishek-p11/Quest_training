package com.quest.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abhishek");
        list.add("bob");
        list.add("jack");

        Consumer<String> printUppercase = name -> System.out.println(name.toUpperCase());

        Consumer<String> printLength = name -> System.out.println("length:"+name.length());

        Predicate<String> isLengthGreaterThanFive = name -> name.length() > 5;

        list.forEach(name-> {
            if (isLengthGreaterThanFive.test(name)) {
                printUppercase.accept(name);
                printLength.accept(name);
            }
        }
        );
    }
}
