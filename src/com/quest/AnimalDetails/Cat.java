package com.quest.AnimalDetails;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow");
    }

    @Override
    public void move() {
        System.out.println(getName() + " walks on four legs.");
    }
}
