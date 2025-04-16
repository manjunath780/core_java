package com.xworkz.inheritance;

import com.xworkz.inheritance.clothing.Clothing;
import com.xworkz.inheritance.tshirt.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.madeOfFabric();
        clothing.wornOnBody();
        clothing.providesComfort();
        clothing.comesInDifferentSizes();
        clothing.usedForFashion();

        Clothing clothingRef = new TShirt();
        clothingRef.madeOfFabric();
        clothingRef.wornOnBody();
        clothingRef.providesComfort();
        clothingRef.comesInDifferentSizes();
        clothingRef.usedForFashion();

        TShirt tshirt = new TShirt();
        tshirt.madeOfFabric();
        tshirt.wornOnBody();
        tshirt.madeOfCotton();
        tshirt.casualWear();
        tshirt.availableInVariousColors();
    }
}

