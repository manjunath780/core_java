package com.xworkz.inheritance.pen;

import com.xworkz.inheritance.stationery.Stationery;

public class Pen extends Stationery {

    public void write() {
        System.out.println("Pen is used for writing");
    }

    public void hasInk() {
        System.out.println("Pen contains ink");
    }

    public void differentColors() {
        System.out.println("Pens come in different colors like blue, black, red");
    }

    public void refillable() {
        System.out.println("Some pens are refillable");
    }
}
