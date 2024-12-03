package com.quest.Queue;

import java.util.ArrayList;
import java.util.Comparator;

public class CaseStudy {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1=new Student(103,"abhi",20);
        students.add(student1);
        Student student2=new Student(102,"arun",22);
        students.add(student2);
        Student student3=new Student(104,"rohith",22);
        students.add(student3);
        Student student4=new Student(101,"aadhi",18);
        students.add(student4);

        students.sort(Comparator.comparingInt(Student::getId));
        for (Student student : students) {
            System.out.println(student);

        }
    }
}
