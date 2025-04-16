package com.xworkz.inheritance;

import com.xworkz.inheritance.eyewear.Eyewear;
import com.xworkz.inheritance.sunglasses.Sunglasses;

public class SunglassRunner {
    public static void main(String[] args) {
        Eyewear eyewear = new Sunglasses();
        Sunglasses sunglasses = (Sunglasses) eyewear;
        System.out.println(sunglasses);
    }
}
