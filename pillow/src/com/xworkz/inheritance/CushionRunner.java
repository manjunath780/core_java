package com.xworkz.inheritance;

import com.xworkz.inheritance.cushion.Cushion;
import com.xworkz.inheritance.pillow.Pillow;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new Cushion();
        cushion.comfort();

        Pillow pillow = new Pillow();
        pillow.comfort();
    }
}
