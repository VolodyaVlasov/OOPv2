package com.company;

public class Test {
    public void hello(){
        System.out.println("Hello");
    }
}

class deepTest extends Test {
    @Override
    public void hello() {            //метод публичен в родительском классе А и публичен в его потомке B;
        System.out.println("Hello from deep");
    }
}
