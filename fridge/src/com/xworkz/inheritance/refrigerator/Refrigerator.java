package com.xworkz.inheritance.refrigerator;

import com.xworkz.inheritance.appliance.Appliance;

public class Refrigerator extends Appliance {
    public void coolItems() {
        System.out.println("Refrigerator cools and preserves items");
    }

    public void hasFreezer() {
        System.out.println("Refrigerator has a freezer section");
    }

    public void adjustableTemperature() {
        System.out.println("Refrigerator has adjustable temperature settings");
    }

    public void autoDefrost() {
        System.out.println("Refrigerator supports auto defrost");
    }}