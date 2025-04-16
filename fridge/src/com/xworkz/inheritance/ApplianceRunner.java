package com.xworkz.inheritance;

import com.xworkz.inheritance.appliance.Appliance;
import com.xworkz.inheritance.refrigerator.Refrigerator;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumesElectricity();
        appliance.hasWarranty();
        appliance.manufacturedByCompany();

        Appliance applianceRef = new Refrigerator(); // Upcasting
        applianceRef.powerOn();
        applianceRef.powerOff();
        applianceRef.consumesElectricity();
        applianceRef.hasWarranty();
        applianceRef.manufacturedByCompany();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.powerOn();
        refrigerator.consumesElectricity();
        refrigerator.coolItems();
        refrigerator.hasFreezer();
        refrigerator.autoDefrost();
    }
}
