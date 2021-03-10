package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    }

    public void pizzaWeight(List<? extends Pizza> list) { // ковариантность
    }

    public void pizzaPrice(List<? super fourCheeses> list) { //контвариантность
    }

}

class Pizza {
}

class fourCheeses extends Pizza {
}

