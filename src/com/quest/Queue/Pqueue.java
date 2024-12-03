package com.quest.Queue;

import java.util.PriorityQueue;

public class Pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Long> pq1 = new PriorityQueue<>();
        PriorityQueue<Float> pq2 = new PriorityQueue<>();
        PriorityQueue<Boolean> pq3 = new PriorityQueue<>();
        PriorityQueue<Byte> pq4 = new PriorityQueue<>();
        PriorityQueue<Character> pq5 = new PriorityQueue<>();
        PriorityQueue<Short> pq6 = new PriorityQueue<>();
        PriorityQueue<Double> pq7 = new PriorityQueue<>();

        System.out.println("---Integer---");
        pq.add(6);
        pq.add(24);
        pq.add(37);
        pq.add(16);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println("--Long--");
        pq1.add(6244220L);
        pq1.add(2434578L);
        pq1.add(373487L);
        pq1.add(1621364576L);
         System.out.println(pq1.peek());
         System.out.println(pq1.poll());
         System.out.println(pq1);

         System.out.println("--Float--");
         pq2.add(5.8f);
         pq2.add(8.9f);
         pq2.add(3.0f);
         pq2.add(6.0f);
         System.out.println(pq2.peek());
         System.out.println(pq2.poll());
         System.out.println(pq2);

         System.out.println("--Boolean--");
         pq3.add(true);
         pq3.add(false);
         pq3.add(true);
         pq3.add(false);
         System.out.println(pq3.peek());
         System.out.println(pq3.poll());
         System.out.println(pq3);

         System.out.println("--Byte--");
         pq4.add((byte)-125);
         pq4.add((byte)127);
         pq4.add((byte)100);
         pq4.add((byte)-101);
         System.out.println(pq4.peek());
         System.out.println(pq4.poll());
         System.out.println(pq4);

         System.out.println("--Character--");
         pq5.add('C');
         pq5.add('B');
         pq5.add('A');
         pq5.add('D');
         System.out.println(pq5.peek());
         System.out.println(pq5.poll());
         System.out.println(pq5);

         System.out.println("--Short--");
         pq6.add((short)650);
         pq6.add((short)-65);
         pq6.add((short)356);
         pq6.add((short)-35);
         System.out.println(pq6.peek());
         System.out.println(pq6.poll());
         System.out.println(pq6);

         System.out.println("--Double--");
         pq7.add(5.8d);
         pq7.add(8.9d);
         pq7.add(3.0d);
         pq7.add(6.0d);
         System.out.println(pq7.peek());
         System.out.println(pq7.poll());
         System.out.println(pq7);



    }
}
