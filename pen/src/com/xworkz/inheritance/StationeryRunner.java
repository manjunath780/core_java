package com.xworkz.inheritance;

import com.xworkz.inheritance.stationery.Stationery;
import com.xworkz.inheritance.pen.Pen;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        stationery.usedInSchool();
        stationery.availableInShops();
        stationery.helpsInWriting();
        stationery.comesInVariousTypes();
        stationery.mostlyAffordable();

        Stationery stationeryRef = new Pen(); // Upcasting
        stationeryRef.usedInSchool();
        stationeryRef.availableInShops();
        stationeryRef.helpsInWriting();
        stationeryRef.comesInVariousTypes();
        stationeryRef.mostlyAffordable();

        Pen pen = new Pen();
        pen.usedInSchool();
        pen.helpsInWriting();
        pen.write();
        pen.hasInk();
        pen.refillable();
    }
}
