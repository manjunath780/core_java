package com.xworkz.inheritance;

import com.xworkz.inheritance.eyewear.Eyewear;
import com.xworkz.inheritance.sunglasses.Sunglasses;

public class EyewearRunner {
    public static void main(String[] args) {
        Eyewear eyewear = new Eyewear();
        eyewear.wornOnEyes();
        eyewear.improvesVision();
        eyewear.frameMaterial();
        eyewear.usedByAllAges();
        eyewear.availableInStores();

        Eyewear eyewearRef = new Sunglasses();
        eyewearRef.wornOnEyes();
        eyewearRef.improvesVision();
        eyewearRef.frameMaterial();
        eyewearRef.usedByAllAges();
        eyewearRef.availableInStores();

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.wornOnEyes();
        sunglasses.improvesVision();
        sunglasses.blocksSunlight();
        sunglasses.stylishLook();
        sunglasses.comesInTints();

    }
}
