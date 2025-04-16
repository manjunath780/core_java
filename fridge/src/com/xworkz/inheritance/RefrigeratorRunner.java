package com.xworkz.inheritance;

import com.xworkz.inheritance.appliance.Appliance;
import com.xworkz.inheritance.refrigerator.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Appliance appliance = new Refrigerator();
        Refrigerator refrigerator = (Refrigerator) appliance;
        System.out.println(refrigerator);
    }
}
