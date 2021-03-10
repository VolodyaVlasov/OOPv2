package com.company;

public class Human {
    public void voice() {
        System.out.println("human voice");
    }

    public static void main(String[] args) {
        Human human = new Worker();
        human.voice();

    }
}

class Worker extends Human {
    @Override
    public void voice() {
        System.out.println("worker voice");
    }
}

