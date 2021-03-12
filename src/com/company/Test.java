package com.company;

public class Test {
    public void hello() {
        System.out.println("Hello");
    }

    protected void goodbye() {
        System.out.println("Goodbye");
    }

    protected void price() {
        System.out.println(10);
    }
}

class deepTest extends Test {
    @Override
    public void hello() {//метод публичен в родительском классе Test и публичен в его потомке deepTest.
        System.out.println("Hello from deep");
    }

    @Override
    public void goodbye() {//метод скрыт в родительском классе Test и публичен в его потомке deepTest.
        System.out.println("Goodbye");
    }

    @Override
    protected void price() { //метод скрыт в родительском классе Test и скрыт в его потомке deepTest.
        System.out.println(100);
    }

}


