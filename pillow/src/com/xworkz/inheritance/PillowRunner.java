package com.xworkz.inheritance;

import com.xworkz.inheritance.cushion.Cushion;
import com.xworkz.inheritance.pillow.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Cushion cushion = new Pillow();
        Pillow pillow = (Pillow) cushion;
        System.out.println(pillow);
    }
}
