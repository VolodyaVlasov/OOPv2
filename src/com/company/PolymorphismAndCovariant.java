package com.company;

public class PolymorphismAndCovariant {
    public Number test(){
        return 0;
    }
}

class Covariant extends PolymorphismAndCovariant {
    @Override
    public Integer test() {  //ковариантность
        return 0;
    }
}

class Polymorphism extends PolymorphismAndCovariant {
    @Override
    public Integer test() {
        return 1;
    }
}



