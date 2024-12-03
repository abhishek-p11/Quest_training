package com.quest.CollectionSampleQuestion;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");
        Student student4 = new Student(4, "David");

        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 80);
        studentMap.put(student2, 70);
        studentMap.put(student3, 90);
        studentMap.put(student4, 60);

        studentMap.forEach((student,mark) -> {
            System.out.println("Student:"+student+"->"+mark);
        });

    }
}
