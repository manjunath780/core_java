package com.xworkz.inheritance;

import com.xworkz.inheritance.bottle.Bottle;
import com.xworkz.inheritance.plastic.Plastic;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.lightweight();
        plastic.recycle();

        Bottle bottle = new Bottle();
        bottle.lightweight();
        bottle.recycle();
    }
}