package com.quest.Queue;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Ptree {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        TreeSet<Integer> ts = new TreeSet<>();
        pq.add(6);
        pq.add(24);
        pq.add(37);
        pq.add(16);
        pq.add(37);

        ts.add(6);
        ts.add(24);
        ts.add(37);
        ts.add(16);
        ts.add(37);

        pq.forEach(System.out::println);
        System.out.println();
        ts.forEach(System.out::println);
    }
}
