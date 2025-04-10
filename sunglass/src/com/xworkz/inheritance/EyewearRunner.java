package com.xworkz.inheritance;

import com.xworkz.inheritance.eyewear.Eyewear;
import com.xworkz.inheritance.sunglasses.Sunglasses;

public class EyewearRunner {
    public static void main(String[] args) {
        Eyewear eyewear = new Eyewear();
        eyewear.protectEyes();

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.protectEyes();
    }
}
