package com.xworkz.inheritance;

import com.xworkz.inheritance.bedding.Bedding;
import com.xworkz.inheritance.blanket.Blanket;

public class BeddingRunner {
    public static void main(String[] args) {
        Bedding bedding = new Bedding();
        bedding.includesPillow();
        bedding.arrangedOnBed();
        bedding.comfortableSleep();

        Bedding blanket1 = new Blanket();
        blanket1.includesPillow();
        blanket1.arrangedOnBed();
        blanket1.comfortableSleep();



        Blanket blanket = new Blanket();
        blanket.provideWarmth();
        blanket.madeOfWool();
        blanket.softTexture();
        blanket.rectangularShape();
        blanket.usedInWinter();
    }
}
