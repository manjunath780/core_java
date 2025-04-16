package com.xworkz.inheritance;

import com.xworkz.inheritance.bottle.Bottle;
import com.xworkz.inheritance.plastic.Plastic;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.lightweight();
        plastic.recycle();
        plastic.waterproof();
        plastic.lowCost();
        plastic.nonBiodegradable();

        Plastic plasticRef = new Bottle();
        plasticRef.lightweight();
        plasticRef.recycle();
        plasticRef.waterproof();
        plasticRef.lowCost();
        plasticRef.nonBiodegradable();

        Bottle bottle = new Bottle();
        bottle.lightweight();
        bottle.recycle();
        bottle.storeLiquids();
        bottle.hasCap();
        bottle.reusable();
    }
}