package com.xworkz.inheritance;

import com.xworkz.inheritance.spoon.Spoon;
import com.xworkz.inheritance.utensil.Utensil;

public class SpoonRunner {
    public static void main(String[] args) {
        Utensil utensil= new Spoon();
        Spoon spoon = (Spoon) utensil;
        System.out.println(spoon);
    }
}
