package com.quest.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(9);
        //pq.forEach(System.out::println);
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("a");
        pq2.add("b");
        pq2.add("c");
        pq2.add("d");
       // pq2.add(null);
        System.out.println(pq2.peek());
        pq2.poll();
        pq2.forEach(System.out::println);
        System.out.println(pq2.offer("e"));//adding elements
        System.out.println(pq2.remove());//remove the first element



        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.peek());


    }
}
