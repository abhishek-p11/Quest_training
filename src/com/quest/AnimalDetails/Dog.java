package com.quest.AnimalDetails;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: bow bow");
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on four legs.");
    }
}


