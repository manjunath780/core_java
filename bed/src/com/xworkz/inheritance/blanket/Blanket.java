package com.xworkz.inheritance.blanket;

import com.xworkz.inheritance.bedding.Bedding;

public class Blanket extends Bedding {
    public void provideWarmth() {
        System.out.println("Blanket provides warmth");
    }

    public void madeOfWool() {
        System.out.println("Blanket is usually made of wool or cotton");
    }

    public void softTexture() {
        System.out.println("Blanket has a soft texture");
    }

    public void rectangularShape() {
        System.out.println("Blanket is generally rectangular in shape");
    }

    public void usedInWinter() {
        System.out.println("Blanket is mostly used during winter");
    }
}
