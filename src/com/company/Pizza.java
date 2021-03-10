package com.company;

import java.util.List;

public class Pizza {
    public void pizzaWeight(List<? extends Pizza> list) { // ковариантность
    }

    public void pizzaPrice(List<? super fourCheeses> list) { //контвариантность
    }
}
class fourCheeses extends Pizza {
}