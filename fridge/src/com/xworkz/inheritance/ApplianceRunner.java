package com.xworkz.inheritance;

import com.xworkz.inheritance.appliance.Appliance;
import com.xworkz.inheritance.refrigerator.Refrigerator;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.operate();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.operate();
    }
}
