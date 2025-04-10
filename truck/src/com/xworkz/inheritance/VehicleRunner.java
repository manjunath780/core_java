package com.xworkz.inheritance;

import com.xworkz.inheritance.vehicle.Vehicle;
import com.xworkz.inheritance.truck.Truck;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Truck truck = new Truck();
        truck.move();
    }
}
