package com.company;

public abstract class Animal {
    final String name;

    Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void voice();
}

//Наследование
class Cat extends Animal {
    final String color;

    Cat(final String name, final String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }
}

//Наследование
class Dog extends Animal {
    final boolean goodBoy;

    Dog(final String name, boolean goodBoy) {
        super(name);
        this.goodBoy = goodBoy;
    }

    @Override
    public void voice() {
        System.out.println("gav");
    }
}

class Monster {
    final String name;
    Animal animal; // Композиция

    Monster(final String name, final Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    //Полиморфизм
    public void eat(Animal animal) {
        this.animal = animal;
        System.out.println("i ate " + animal.getName());
    }

    //Полиморфизм
    public void voice() {
        animal.voice();
    }
}
