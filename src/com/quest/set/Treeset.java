package com.quest.set;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(3);
        t.add(2);
        t.add(4);
        t.add(null);

        for (Integer i : t) {
            System.out.println(i);
        }
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.descendingSet());
        System.out.println(t.headSet(5));
        System.out.println(t.first());
        System.out.println(t.last());


    }
}
