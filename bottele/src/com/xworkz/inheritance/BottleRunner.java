package com.xworkz.inheritance;

import com.xworkz.inheritance.bottle.Bottle;
import com.xworkz.inheritance.plastic.Plastic;

public class BottleRunner {
    public static void main(String[] args) {
        Plastic plastic = new Bottle();
        Bottle bottle = (Bottle) plastic;
        System.out.println(bottle);
    }
}
