package com.xworkz.inheritance;

import com.xworkz.inheritance.stationery.Stationery;
import com.xworkz.inheritance.pen.Pen;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        stationery.write();

        Pen pen = new Pen();
        pen.write();
    }
}
