package com.quest.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("abhi",20,'M',"kannur"));
        list.add(new Person("avinash",18,'M',"palakkad"));
        list.add(new Person("aswin",22,'M',"kannur"));
        list.add(new Person("anjali",19,'f',"eranakulam"));
        list.add(new Person("arun",20,'M',"kannur"));

        System.out.println("age lesser than 20");
        for (Person p : list) {
            if(p.getAge()<20){
                System.out.println(p.getName()+":"+p.getAge());
            }
        }
        System.out.println("age greater than 20");
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getAge()>20){
                System.out.println(p.getName()+":"+p.getAge());
            }
        }
    }
}
