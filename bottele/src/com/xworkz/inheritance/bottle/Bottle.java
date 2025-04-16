package com.xworkz.inheritance.bottle;

import com.xworkz.inheritance.plastic.Plastic;

public class Bottle extends Plastic {
    public void storeLiquids() {
        System.out.println("Bottle is used to store liquids");
    }

    public void reusable() {
        System.out.println("Bottle can be reused");
    }

    public void hasCap() {
        System.out.println("Bottle comes with a cap");
    }

    public void transparent() {
        System.out.println("Some bottles are transparent");
    }
}