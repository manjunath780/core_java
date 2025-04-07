package com.xworkz.cookerApp;

import com.xworkz.cookerApp.cooker.Cooker;

public class CookerRunner {

    public static void main(String[] args) {
        System.out.println("CookerRunner main started");

        Cooker cooker1 = new Cooker();
        cooker1.setCookerId(301);
        cooker1.setCookerBrand("Prestige");
        cooker1.setCookerType("Pressure Cooker");
        cooker1.setCookerCapacity(5.0);  // 5 liters
        cooker1.setCookerPrice(1500.00);
        cooker1.setElectric(false);

        int cookerId1 = cooker1.getCookerId();
        String cookerBrand1 = cooker1.getCookerBrand();
        String cookerType1 = cooker1.getCookerType();
        double cookerCapacity1 = cooker1.getCookerCapacity();
        double cookerPrice1 = cooker1.getCookerPrice();
        boolean isElectric1 = cooker1.isElectric();

        Cooker cooker2 = new Cooker();
        cooker2.setCookerId(302);
        cooker2.setCookerBrand("Butterfly");
        cooker2.setCookerType("Gas Cooker");
        cooker2.setCookerCapacity(3.0);  // 3 liters
        cooker2.setCookerPrice(1000.00);
        cooker2.setElectric(false);

        int cookerId2 = cooker2.getCookerId();
        String cookerBrand2 = cooker2.getCookerBrand();
        String cookerType2 = cooker2.getCookerType();
        double cookerCapacity2 = cooker2.getCookerCapacity();
        double cookerPrice2 = cooker2.getCookerPrice();
        boolean isElectric2 = cooker2.isElectric();

        Cooker cooker3 = new Cooker();
        cooker3.setCookerId(303);
        cooker3.setCookerBrand("Panasonic");
        cooker3.setCookerType("Electric Cooker");
        cooker3.setCookerCapacity(1.8);  // 1.8 liters
        cooker3.setCookerPrice(2200.00);
        cooker3.setElectric(true);

        int cookerId3 = cooker3.getCookerId();
        String cookerBrand3 = cooker3.getCookerBrand();
        String cookerType3 = cooker3.getCookerType();
        double cookerCapacity3 = cooker3.getCookerCapacity();
        double cookerPrice3 = cooker3.getCookerPrice();
        boolean isElectric3 = cooker3.isElectric();

        Cooker cooker4 = new Cooker();
        cooker4.setCookerId(304);
        cooker4.setCookerBrand("Hawkins");
        cooker4.setCookerType("Pressure Cooker");
        cooker4.setCookerCapacity(6.0);  // 6 liters
        cooker4.setCookerPrice(1800.00);
        cooker4.setElectric(false);

        int cookerId4 = cooker4.getCookerId();
        String cookerBrand4 = cooker4.getCookerBrand();
        String cookerType4 = cooker4.getCookerType();
        double cookerCapacity4 = cooker4.getCookerCapacity();
        double cookerPrice4 = cooker4.getCookerPrice();
        boolean isElectric4 = cooker4.isElectric();

        Cooker cooker5 = new Cooker();
        cooker5.setCookerId(305);
        cooker5.setCookerBrand("Philips");
        cooker5.setCookerType("Electric Cooker");
        cooker5.setCookerCapacity(2.5);  // 2.5 liters
        cooker5.setCookerPrice(2500.00);
        cooker5.setElectric(true);

        int cookerId5 = cooker5.getCookerId();
        String cookerBrand5 = cooker5.getCookerBrand();
        String cookerType5 = cooker5.getCookerType();
        double cookerCapacity5 = cooker5.getCookerCapacity();
        double cookerPrice5 = cooker5.getCookerPrice();
        boolean isElectric5 = cooker5.isElectric();


        System.out.println("Cooker ID: " + cookerId1);
        System.out.println("Cooker Brand: " + cookerBrand1);
        System.out.println("Cooker Type: " + cookerType1);
        System.out.println("Cooker Capacity: " + cookerCapacity1 + " liters");
        System.out.println("Cooker Price: ₹" + cookerPrice1);
        System.out.println("Is it Electric? " + (isElectric1 ? "Yes" : "No"));
        System.out.println("---------------*---------------");

        System.out.println("Cooker ID: " + cookerId2);
        System.out.println("Cooker Brand: " + cookerBrand2);
        System.out.println("Cooker Type: " + cookerType2);
        System.out.println("Cooker Capacity: " + cookerCapacity2 + " liters");
        System.out.println("Cooker Price: ₹" + cookerPrice2);
        System.out.println("Is it Electric? " + (isElectric2 ? "Yes" : "No"));
        System.out.println("--------------*----------------");

        System.out.println("Cooker ID: " + cookerId3);
        System.out.println("Cooker Brand: " + cookerBrand3);
        System.out.println("Cooker Type: " + cookerType3);
        System.out.println("Cooker Capacity: " + cookerCapacity3 + " liters");
        System.out.println("Cooker Price: ₹" + cookerPrice3);
        System.out.println("Is it Electric? " + (isElectric3 ? "Yes" : "No"));
        System.out.println("---------------*---------------");

        System.out.println("Cooker ID: " + cookerId4);
        System.out.println("Cooker Brand: " + cookerBrand4);
        System.out.println("Cooker Type: " + cookerType4);
        System.out.println("Cooker Capacity: " + cookerCapacity4 + " liters");
        System.out.println("Cooker Price: ₹" + cookerPrice4);
        System.out.println("Is it Electric? " + (isElectric4 ? "Yes" : "No"));
        System.out.println("--------------*----------------");

        System.out.println("Cooker ID: " + cookerId5);
        System.out.println("Cooker Brand: " + cookerBrand5);
        System.out.println("Cooker Type: " + cookerType5);
        System.out.println("Cooker Capacity: " + cookerCapacity5 + " liters");
        System.out.println("Cooker Price: ₹" + cookerPrice5);
        System.out.println("Is it Electric? " + (isElectric5 ? "Yes" : "No"));
        System.out.println("-------------*-----------------");
    }
}
