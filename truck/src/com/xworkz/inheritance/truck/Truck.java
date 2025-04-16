package com.xworkz.inheritance.truck;

import com.xworkz.inheritance.vehicle.Vehicle;

public class Truck extends Vehicle {
    public void carryHeavyLoad() {
        System.out.println("Truck is used to carry heavy loads");
    }

    public void hasLargeStorage() {
        System.out.println("Truck has a large storage area at the back");
    }

    public void moreWheels() {
        System.out.println("Truck usually has more than 4 wheels");
    }

    public void usedForDelivery() {
        System.out.println("Truck is often used for delivery and logistics");
    }
}