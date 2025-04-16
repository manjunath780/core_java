package com.xworkz.inheritance.chair;

import com.xworkz.inheritance.furniture.Furniture;

public class Chair extends Furniture {
    public void hasLegs() {
        System.out.println("Chair has four legs");
    }

    public void hasBackrest() {
        System.out.println("Chair has a backrest for support");
    }

    public void portable() {
        System.out.println("Chair is portable and movable");
    }

    public void usedForSitting() {
        System.out.println("Chair is used for sitting");
    }
}
