package com.company;

public abstract class Robot {

}

class GasRobot extends Robot {
}

class ElectroRobot extends Robot {

}

class Charge {
    public void charge(GasRobot gasRobot) {
        //заливаем бензин
    }

    public void charge(ElectroRobot electroRobot) {
        //заряжаем аккамулятор
    }
}

