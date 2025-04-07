package com.xworkz.graniteApp;


import com.xworkz.graniteApp.granite.Granite;

public class GraniteRunner {

    public static void main(String[] args) {
        System.out.println("GraniteRunner main started");

        Granite granite1 = new Granite();
        granite1.setGraniteId(201);
        granite1.setGraniteBrand("Madhusudan");
        granite1.setGraniteColor("Black");
        granite1.setGraniteSize("80x80 cm");
        granite1.setGranitePrice(2500.99);
        granite1.setGraniteType("Polished");

        int graniteId1 = granite1.getGraniteId();
        String graniteBrand1 = granite1.getGraniteBrand();
        String graniteColor1 = granite1.getGraniteColor();
        String graniteSize1 = granite1.getGraniteSize();
        double granitePrice1 = granite1.getGranitePrice();
        String graniteType1 = granite1.getGraniteType();

        Granite granite2 = new Granite();
        granite2.setGraniteId(202);
        granite2.setGraniteBrand("Aqua");
        granite2.setGraniteColor("White");
        granite2.setGraniteSize("60x60 cm");
        granite2.setGranitePrice(1999.50);
        granite2.setGraniteType("Matte");

        int graniteId2 = granite2.getGraniteId();
        String graniteBrand2 = granite2.getGraniteBrand();
        String graniteColor2 = granite2.getGraniteColor();
        String graniteSize2 = granite2.getGraniteSize();
        double granitePrice2 = granite2.getGranitePrice();
        String graniteType2 = granite2.getGraniteType();

        Granite granite3 = new Granite();
        granite3.setGraniteId(203);
        granite3.setGraniteBrand("Cedar");
        granite3.setGraniteColor("Grey");
        granite3.setGraniteSize("90x90 cm");
        granite3.setGranitePrice(3000.75);
        granite3.setGraniteType("Polished");

        int graniteId3 = granite3.getGraniteId();
        String graniteBrand3 = granite3.getGraniteBrand();
        String graniteColor3 = granite3.getGraniteColor();
        String graniteSize3 = granite3.getGraniteSize();
        double granitePrice3 = granite3.getGranitePrice();
        String graniteType3 = granite3.getGraniteType();

        Granite granite4 = new Granite();
        granite4.setGraniteId(204);
        granite4.setGraniteBrand("StoneCraft");
        granite4.setGraniteColor("Beige");
        granite4.setGraniteSize("100x100 cm");
        granite4.setGranitePrice(3500.80);
        granite4.setGraniteType("Matte");

        int graniteId4 = granite4.getGraniteId();
        String graniteBrand4 = granite4.getGraniteBrand();
        String graniteColor4 = granite4.getGraniteColor();
        String graniteSize4 = granite4.getGraniteSize();
        double granitePrice4 = granite4.getGranitePrice();
        String graniteType4 = granite4.getGraniteType();

        Granite granite5 = new Granite();
        granite5.setGraniteId(205);
        granite5.setGraniteBrand("Taj");
        granite5.setGraniteColor("Red");
        granite5.setGraniteSize("80x80 cm");
        granite5.setGranitePrice(2800.25);
        granite5.setGraniteType("Polished");

        int graniteId5 = granite5.getGraniteId();
        String graniteBrand5 = granite5.getGraniteBrand();
        String graniteColor5 = granite5.getGraniteColor();
        String graniteSize5 = granite5.getGraniteSize();
        double granitePrice5 = granite5.getGranitePrice();
        String graniteType5 = granite5.getGraniteType();

        System.out.println("Granite ID: " + graniteId1);
        System.out.println("Granite Brand: " + graniteBrand1);
        System.out.println("Granite Color: " + graniteColor1);
        System.out.println("Granite Size: " + graniteSize1);
        System.out.println("Granite Price: ₹" + granitePrice1);
        System.out.println("Granite Type: " + graniteType1);
        System.out.println("------------------------------");

        System.out.println("Granite ID: " + graniteId2);
        System.out.println("Granite Brand: " + graniteBrand2);
        System.out.println("Granite Color: " + graniteColor2);
        System.out.println("Granite Size: " + graniteSize2);
        System.out.println("Granite Price: ₹" + granitePrice2);
        System.out.println("Granite Type: " + graniteType2);
        System.out.println("------------------------------");

        System.out.println("Granite ID: " + graniteId3);
        System.out.println("Granite Brand: " + graniteBrand3);
        System.out.println("Granite Color: " + graniteColor3);
        System.out.println("Granite Size: " + graniteSize3);
        System.out.println("Granite Price: ₹" + granitePrice3);
        System.out.println("Granite Type: " + graniteType3);
        System.out.println("------------------------------");

        System.out.println("Granite ID: " + graniteId4);
        System.out.println("Granite Brand: " + graniteBrand4);
        System.out.println("Granite Color: " + graniteColor4);
        System.out.println("Granite Size: " + graniteSize4);
        System.out.println("Granite Price: ₹" + granitePrice4);
        System.out.println("Granite Type: " + graniteType4);
        System.out.println("------------------------------");

        System.out.println("Granite ID: " + graniteId5);
        System.out.println("Granite Brand: " + graniteBrand5);
        System.out.println("Granite Color: " + graniteColor5);
        System.out.println("Granite Size: " + graniteSize5);
        System.out.println("Granite Price: ₹" + granitePrice5);
        System.out.println("Granite Type: " + graniteType5);
        System.out.println("------------------------------");
    }
}
