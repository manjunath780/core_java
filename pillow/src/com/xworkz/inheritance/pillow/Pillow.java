package com.xworkz.inheritance.pillow;

import com.xworkz.inheritance.cushion.Cushion;

public class Pillow extends Cushion {
    public void usedWhileSleeping() {
        System.out.println("Pillow is used to support the head while sleeping");
    }

    public void hasPillowCover() {
        System.out.println("Pillow is usually covered with a pillowcase");
    }

    public void canBeFirmOrSoft() {
        System.out.println("Pillow can be firm or soft depending on the filling");
    }

    public void supportsNeck() {
        System.out.println("Pillow provides neck support");
    }}
