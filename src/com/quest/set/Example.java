package com.quest.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            hset.add(i);
        }
        System.out.println(hset);
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        for(int i = 1; i <= 100; i++){
            lset.add(i);
        }
        System.out.println(lset);
        TreeSet<Integer> tset = new TreeSet<>();
        for(int i = 1; i <= 100; i++){
            tset.add(i);
        }
        System.out.println(tset);
        System.out.println("");
        HashSet<Integer> hset2 = new HashSet<>();
        hset2.add(28);
        hset2.add(31);
        hset2.add(37);
        hset2.add(53);
        hset2.add(64);
        hset2.add(72);
        hset2.add(87);
        hset2.add(97);
        hset2.add(43);
        hset2.add(100);
        System.out.println(hset2);
//
        LinkedHashSet<Integer> lset2 = new LinkedHashSet<>();
        lset2.add(28);
        lset2.add(31);
        lset2.add(37);
        lset2.add(53);
        lset2.add(64);
        lset2.add(72);
        lset2.add(87);
        lset2.add(97);
        lset2.add(43);
        lset2.add(100);
        System.out.println(lset2);
//
        TreeSet<Integer> tset2 = new TreeSet<>();
        tset2.add(28);
        tset2.add(31);
        tset2.add(37);
        tset2.add(53);
        tset2.add(64);
        tset2.add(72);
        tset2.add(87);
        tset2.add(97);
        tset2.add(43);
        tset2.add(100);
        System.out.println(tset2);
        System.out.println("");
//
        HashSet<Integer> hset3 = new HashSet<>();
        hset3.add(28);
        hset3.add(31);
        hset3.add(37);
        hset3.add(null);
        hset3.add(null);
        hset3.add(null);
        System.out.println(hset3);
//
        LinkedHashSet<Integer> lset3 = new LinkedHashSet<>();
        lset3.add(28);
        lset3.add(31);
        lset3.add(37);
        lset3.add(null);
        lset3.add(null);
        lset3.add(null);
        System.out.println(lset3);
//
        TreeSet<Integer> tset3 = new TreeSet<>();
        tset3.add(28);
        tset3.add(31);
        tset3.add(37);
        tset3.add(null);
        tset3.add(null);
        tset3.add(null);
        System.out.println(tset3);
   }
    }
