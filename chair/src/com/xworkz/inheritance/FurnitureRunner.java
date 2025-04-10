package com.xworkz.inheritance;

import com.xworkz.inheritance.furniture.Furniture;
import com.xworkz.inheritance.chair.Chair;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.support();

        Chair chair = new Chair();
        chair.support();
    }
}
