package com.xworkz.shirtApp;

import com.xworkz.shirtApp.shirt.Shirt;

public class ShirtRunner {

    public static void main(String[] args) {
        System.out.println("ShirtRunner main started");


        Shirt shirt1 = new Shirt();
        shirt1.setShirtId(101);
        shirt1.setShirtBrand("Nike");
        shirt1.setShirtColor("Blue");
        shirt1.setShirtSize("L");
        shirt1.setShirtPrice(799.99);
        shirt1.setShirtFabric("Cotton");
        shirt1.setFormal(true);

        int shirtId1 = shirt1.getShirtId();
        String shirtBrand1 = shirt1.getShirtBrand();
        String shirtColor1 = shirt1.getShirtColor();
        String shirtSize1 = shirt1.getShirtSize();
        double shirtPrise1 = shirt1.getShirtPrice();
        String shirtFabric1 = shirt1.getShirtFabric();
        boolean isFormal1 = true;

        Shirt shirt2 = new Shirt();
        shirt2.setShirtId(102);
        shirt2.setShirtBrand("Adidas");
        shirt2.setShirtColor("Red");
        shirt2.setShirtSize("M");
        shirt2.setShirtPrice(899.99);
        shirt2.setShirtFabric("Polyester");
        shirt2.setFormal(false);

        int shirtId2 = shirt2.getShirtId();
        String shirtBrand2 = shirt2.getShirtBrand();
        String shirtColor2 = shirt2.getShirtColor();
        String shirtSize2 = shirt2.getShirtSize();
        double shirtPrise2 = shirt2.getShirtPrice();
        String shirtFabric2 = shirt2.getShirtFabric();
        boolean isFormal2 = true;

        Shirt shirt3 = new Shirt();
        shirt3.setShirtId(103);
        shirt3.setShirtBrand("Puma");
        shirt3.setShirtColor("Black");
        shirt3.setShirtSize("XL");
        shirt3.setShirtPrice(1200.00);
        shirt3.setShirtFabric("Cotton");
        shirt3.setFormal(true);

        int shirtId3 = shirt3.getShirtId();
        String shirtBrand3 = shirt3.getShirtBrand();
        String shirtColor3 = shirt3.getShirtColor();
        String shirtSize3 = shirt3.getShirtSize();
        double shirtPrise3 = shirt3.getShirtPrice();
        String shirtFabric3 = shirt3.getShirtFabric();
        boolean isFormal3 = true;

        Shirt shirt4 = new Shirt();
        shirt4.setShirtId(104);
        shirt4.setShirtBrand("Reebok");
        shirt4.setShirtColor("Green");
        shirt4.setShirtSize("S");
        shirt4.setShirtPrice(699.50);
        shirt4.setShirtFabric("Linen");
        shirt4.setFormal(false);

        int shirtId4 = shirt4.getShirtId();
        String shirtBrand4 = shirt4.getShirtBrand();
        String shirtColor4 = shirt4.getShirtColor();
        String shirtSize4 = shirt4.getShirtSize();
        double shirtPrise4 = shirt4.getShirtPrice();
        String shirtFabric4 = shirt4.getShirtFabric();
        boolean isFormal4 = true;

        Shirt shirt5 = new Shirt();
        shirt5.setShirtId(105);
        shirt5.setShirtBrand("Levi's");
        shirt5.setShirtColor("White");
        shirt5.setShirtSize("L");
        shirt5.setShirtPrice(999.99);
        shirt5.setShirtFabric("Denim");
        shirt5.setFormal(true);

        int shirtId5 = shirt5.getShirtId();
        String shirtBrand5 = shirt5.getShirtBrand();
        String shirtColor5 = shirt5.getShirtColor();
        String shirtSize5 = shirt5.getShirtSize();
        double shirtPrise5 = shirt5.getShirtPrice();
        String shirtFabric5 = shirt5.getShirtFabric();
        boolean isFormal5 = true;

        System.out.println("shirt id "+shirtId1);
        System.out.println("Shirt Brand: " + shirtBrand1);
        System.out.println("Shirt Color: " + shirtColor1);
        System.out.println("Shirt Size: " + shirtSize1);
        System.out.println("Shirt Price: ₹" + shirtPrise1);
        System.out.println("Shirt Fabric: " + shirtFabric1);
        System.out.println("Is it Formal? " + (isFormal1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("shirt id "+shirtId2);
        System.out.println("Shirt Brand: " + shirtBrand2);
        System.out.println("Shirt Color: " + shirtColor2);
        System.out.println("Shirt Size: " + shirtSize2);
        System.out.println("Shirt Price: ₹" + shirtPrise2);
        System.out.println("Shirt Fabric: " + shirtFabric2);
        System.out.println("Is it Formal? " + (isFormal1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("shirt id "+shirtId3);
        System.out.println("Shirt Brand: " + shirtBrand3);
        System.out.println("Shirt Color: " + shirtColor3);
        System.out.println("Shirt Size: " + shirtSize3);
        System.out.println("Shirt Price: ₹" + shirtPrise3);
        System.out.println("Shirt Fabric: " + shirtFabric3);
        System.out.println("Is it Formal? " + (isFormal3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("shirt id "+shirtId4);
        System.out.println("Shirt Brand: " + shirtBrand4);
        System.out.println("Shirt Color: " + shirtColor4);
        System.out.println("Shirt Size: " + shirtSize4);
        System.out.println("Shirt Price: ₹" + shirtPrise4);
        System.out.println("Shirt Fabric: " + shirtFabric4);
        System.out.println("Is it Formal? " + (isFormal4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("shirt id "+shirtId5);
        System.out.println("Shirt Brand: " + shirtBrand5);
        System.out.println("Shirt Color: " + shirtColor5);
        System.out.println("Shirt Size: " + shirtSize5);
        System.out.println("Shirt Price: ₹" + shirtPrise5);
        System.out.println("Shirt Fabric: " + shirtFabric5);
        System.out.println("Is it Formal? " + (isFormal5 ? "Yes" : "No"));
        System.out.println("------------------------------");

    }

}

