package com.company;

public class Doctor {
    public final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void toHeal(HomePet pet) {

    }
}

class MegaDoctor extends Doctor { //наследник задаёт более общий случай родителя

    public MegaDoctor(String name) {
        super(name);
    }

    public void toHeal(Pet pet) {

    }
}

class HomeDoctor extends Doctor { // наследник задаёт более специализированный случай родителя
    public HomeDoctor(String name) {
        super(name);
    }

    public void toHeal(HomeDog pet) {

    }

}


abstract class Pet {

}

class HomePet extends Pet {
}

class HomeDog extends HomePet {
}