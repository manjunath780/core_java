package com.xworkz.inheritance;

import com.xworkz.inheritance.cushion.Cushion;
import com.xworkz.inheritance.pillow.Pillow;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new Cushion();
        cushion.providesComfort();
        cushion.softMaterial();
        cushion.comesInShapes();
        cushion.decorative();
        cushion.usedOnFurniture();

        Cushion cushionRef = new Pillow(); // Upcasting
        cushionRef.providesComfort();
        cushionRef.softMaterial();
        cushionRef.comesInShapes();
        cushionRef.decorative();
        cushionRef.usedOnFurniture();

        Pillow pillow = new Pillow();
        pillow.providesComfort();
        pillow.softMaterial();
        pillow.usedWhileSleeping();
        pillow.hasPillowCover();
        pillow.supportsNeck();

    }}
