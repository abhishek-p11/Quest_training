package com.quest.Collection;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Abhi");
        l.add("Ahmad");
        l.add("Arun");
        l.add("Avinash");
        l.addFirst("David");
        l.addLast("Harry");
        l.add(4,"akshay");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.get(1));
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l.remove(0));
        System.out.println(l.size());
        //l.clear();

        for (String s : l) {
            System.out.println(s);
        }
        LinkedList<String> l2 = new LinkedList<>();
        System.out.println(l2.isEmpty());
        System.out.println(l.contains(new String("Ahmad")));
        l.remove(4);

        LinkedList<Person> l3 = new LinkedList<>();
        System.out.println(l3.isEmpty());
        Person person=new Person():
        l3.remove(person);
    }
}
