package com.quest.Collection;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println(v.size());
        System.out.println(v.get(0));
        System.out.println(v.add(5));
        System.out.println(v.contains(6));
        System.out.println(v.isEmpty());
        System.out.println(v.remove(0));

    }
}
