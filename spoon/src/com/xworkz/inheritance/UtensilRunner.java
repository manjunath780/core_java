package com.xworkz.inheritance;

import com.xworkz.inheritance.utensil.Utensil;
import com.xworkz.inheritance.spoon.Spoon;

public class UtensilRunner {
    public static void main(String[] args) {
        Utensil utensil = new Utensil();
        utensil.usedForCooking();
        utensil.madeOfMetal();
        utensil.hasHandle();
        utensil.easyToClean();
        utensil.foundInKitchen();

        Utensil utensilRef = new Spoon(); // Upcasting
        utensilRef.usedForCooking();
        utensilRef.madeOfMetal();
        utensilRef.hasHandle();
        utensilRef.easyToClean();
        utensilRef.foundInKitchen();

        Spoon spoon = new Spoon();
        spoon.usedForCooking();
        spoon.madeOfMetal();
        spoon.usedForEating();
        spoon.hasBowlShapedEnd();
        spoon.availableInSets();
    }
}

