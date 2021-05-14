package com.company;

import java.util.List;

public class PolymorphismAndCovariant {
    public void voice(Animal1 animal) {
        animal.voice();
    }

    public void voicee(List<? extends Animal1> animals) {
        for (var a : animals)
            a.voice();
    }

    public static void main(String[] args) {
        PolymorphismAndCovariant p = new PolymorphismAndCovariant();
        Dog1 dog = new Dog1();
        p.voice(dog);//полиморфизм
        List<Dog1> dogs = List.of(new Dog1(), new Dog1());
        p.voicee(dogs);//ковариантность
    }
}

class Animal1 {
    public void voice() {
        System.out.println("voice");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void voice() {
        System.out.println("dog voice");
    }
}



