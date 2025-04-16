package com.xworkz.inheritance;

import com.xworkz.inheritance.furniture.Furniture;
import com.xworkz.inheritance.chair.Chair;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.madeOfWood();
        furniture.providesComfort();
        furniture.hasDesign();
        furniture.supportsWeight();
        furniture.usedInHome();

        Furniture furnitureRef = new Chair(); // Upcasting
        furnitureRef.madeOfWood();
        furnitureRef.providesComfort();
        furnitureRef.hasDesign();
        furnitureRef.supportsWeight();
        furnitureRef.usedInHome();

        Chair chair = new Chair();
        chair.madeOfWood();
        chair.providesComfort();
        chair.hasLegs();
        chair.hasBackrest();
        chair.usedForSitting();
    }
}
