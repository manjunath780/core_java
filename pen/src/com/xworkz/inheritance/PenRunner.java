package com.xworkz.inheritance;

import com.xworkz.inheritance.pen.Pen;
import com.xworkz.inheritance.stationery.Stationery;

public class PenRunner {
    public static void main(String[] args) {
        Stationery stationery = new Pen();
        Pen pen = (Pen) stationery;
        System.out.println(pen);


    }
}
