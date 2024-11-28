package com.quest.Collection;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(new Employee(101, "abhi", 28, 15000));

        list.add(1, new Employee(102, "sooraj", 21, 10000));

        list.add(new Employee(103, "amal", 40, 65000));

        list.add(new Employee(104, "alan", 32, 35000));

        list.addLast(new Employee(105, "avinash", 19, 25000));

//Using for each loop

        System.out.println("Salary lesser than 30000 :");

        if (!list.isEmpty()) {

            for (Employee e : list) {

                if (e.getSalary() < 20080) {

                    System.out.println(e.getName() + "," + e.getAge() + "," + e.getSalary() + "," + e.getId());
                }
            }
        }
        System.out.println("\nSalary greater than 30000 :");

        if (!list.isEmpty()) {

            for (Employee e : list) {

                if (e.getSalary() > 30000) {

                    System.out.println(e.getName() + "," + e.getAge() + "," + e.getSalary() + "," + e.getId());
                }
            }
        }


                    System.out.println("\nList size:" +list.size());

                    System.out.println("\n4th person:"+list.get(3).getName());

                    System.out.println("\n1st person: "+list.removeFirst().getName()+" removed");

                    System.out.println("\nLast person: "+list.getLast().getName());

                    System.out.println("\nIndex of Alice" +list.indexOf("Alice"));
    }
}