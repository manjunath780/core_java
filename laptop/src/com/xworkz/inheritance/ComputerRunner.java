package com.xworkz.inheritance;

import com.xworkz.inheritance.computer.Computer;
import com.xworkz.inheritance.laptop.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.performTask();

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.performTask();
    }
}
