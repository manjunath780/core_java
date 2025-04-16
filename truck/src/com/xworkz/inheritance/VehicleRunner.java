package com.xworkz.inheritance;

import com.xworkz.inheritance.vehicle.Vehicle;
import com.xworkz.inheritance.truck.Truck;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
        vehicle.stopEngine();
        vehicle.hasWheels();
        vehicle.usedForTransport();

        Vehicle vehicleRef = new Truck();
        vehicleRef.startEngine();
        vehicleRef.stopEngine();
        vehicleRef.hasWheels();
        vehicleRef.usedForTransport();


        Truck truck = new Truck();
        truck.startEngine();
        truck.hasWheels();
        truck.carryHeavyLoad();
        truck.hasLargeStorage();
        truck.usedForDelivery();


    }
}
