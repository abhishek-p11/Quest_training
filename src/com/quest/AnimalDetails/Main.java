package com.quest.AnimalDetails;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("jacky");
        animals[1] = new Cat("tommy");


        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getName());
            animal.sound();
            animal.move();
            System.out.println();
        }
    }
}
