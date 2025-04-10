package com.xworkz.inheritance;

import com.xworkz.inheritance.utensil.Utensil;
import com.xworkz.inheritance.spoon.Spoon;

public class UtensilRunner {
    public static void main(String[] args) {
        Utensil utensil = new Utensil();
        utensil.use();

        Spoon spoon = new Spoon();
        spoon.use();
    }
}

