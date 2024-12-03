package com.quest.Queue;
import java.util.*;

public class Mainclass {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25, "New York");
        Person person2 = new Person("Bob", 30, "Los Angeles");
        Person person3 = new Person("Charlie", 35, "Chicago");
        Person person4 = new Person("Alice", 25, "New York"); // Duplicate
        Person person5 = new Person("Eve", 40, "Miami");

        System.out.println("=== ArrayList Example ===");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for (Person p : personList) {
            System.out.println(p);
        }
        System.out.println("\n=== LinkedHashSet Example ===");
        LinkedHashSet<Person> personSet = new LinkedHashSet<>(personList);
        for (Person p : personSet) {
            System.out.println(p);
        }
        System.out.println("\n=== HashMap Example ===");
        HashMap<String, Person> personMap = new HashMap<>();
        personMap.put(person1.getName(), person1);
        personMap.put(person2.getName(), person2);
        personMap.put(person3.getName(), person3);
        personMap.put(person5.getName(), person5);

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("\n=== Queue Example ===");
        PriorityQueue<Person> personQueue = new PriorityQueue<>() {
        };
        personQueue.add(person1);
        personQueue.add(person2);
        personQueue.add(person3);

        while (!personQueue.isEmpty()) {
            System.out.println("Processing: " + personQueue.poll());
        }
    }
}
