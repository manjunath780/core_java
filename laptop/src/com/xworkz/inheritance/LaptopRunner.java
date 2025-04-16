package com.xworkz.inheritance;

import com.xworkz.inheritance.computer.Computer;
import com.xworkz.inheritance.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = (Laptop) computer;
        System.out.println(laptop);
    }
}
