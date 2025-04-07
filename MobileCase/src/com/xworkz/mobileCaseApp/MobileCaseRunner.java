package com.xworkz.mobileCaseApp;


import com.xworkz.mobileCaseApp.mobileCase.MobileCase;

public class MobileCaseRunner {

    public static void main(String[] args) {
        System.out.println("MobileCaseRunner main started");

        MobileCase case1 = new MobileCase();
        case1.setId(101);
        case1.setBrand("Spigen");
        case1.setMaterial("Silicone");
        case1.setColor("Black");
        case1.setType("Slim");
        case1.setPrice(699.99);
        case1.setCompatibleModels("iPhone 13, iPhone 12");

        int id1 = case1.getId();
        String brand1 = case1.getBrand();
        String material1 = case1.getMaterial();
        String color1 = case1.getColor();
        String type1 = case1.getType();
        double price1 = case1.getPrice();
        String compatibleModels1 = case1.getCompatibleModels();

        MobileCase case2 = new MobileCase();
        case2.setId(102);
        case2.setBrand("OtterBox");
        case2.setMaterial("Rubber");
        case2.setColor("Blue");
        case2.setType("Heavy Duty");
        case2.setPrice(1299.99);
        case2.setCompatibleModels("Samsung Galaxy S21, S20");

        int id2 = case2.getId();
        String brand2 = case2.getBrand();
        String material2 = case2.getMaterial();
        String color2 = case2.getColor();
        String type2 = case2.getType();
        double price2 = case2.getPrice();
        String compatibleModels2 = case2.getCompatibleModels();

        MobileCase case3 = new MobileCase();
        case3.setId(103);
        case3.setBrand("Caseology");
        case3.setMaterial("TPU");
        case3.setColor("Clear");
        case3.setType("Transparent");
        case3.setPrice(599.99);
        case3.setCompatibleModels("OnePlus 9, OnePlus 8");

        int id3 = case3.getId();
        String brand3 = case3.getBrand();
        String material3 = case3.getMaterial();
        String color3 = case3.getColor();
        String type3 = case3.getType();
        double price3 = case3.getPrice();
        String compatibleModels3 = case3.getCompatibleModels();

        MobileCase case4 = new MobileCase();
        case4.setId(104);
        case4.setBrand("UAG");
        case4.setMaterial("Polycarbonate");
        case4.setColor("Red");
        case4.setType("Shockproof");
        case4.setPrice(1599.99);
        case4.setCompatibleModels("iPhone 12 Pro Max");

        int id4 = case4.getId();
        String brand4 = case4.getBrand();
        String material4 = case4.getMaterial();
        String color4 = case4.getColor();
        String type4 = case4.getType();
        double price4 = case4.getPrice();
        String compatibleModels4 = case4.getCompatibleModels();

        MobileCase case5 = new MobileCase();
        case5.setId(105);
        case5.setBrand("Apple");
        case5.setMaterial("Leather");
        case5.setColor("Midnight Blue");
        case5.setType("Premium");
        case5.setPrice(2499.99);
        case5.setCompatibleModels("iPhone 13 Pro Max");

        int id5 = case5.getId();
        String brand5 = case5.getBrand();
        String material5 = case5.getMaterial();
        String color5 = case5.getColor();
        String type5 = case5.getType();
        double price5 = case5.getPrice();
        String compatibleModels5 = case5.getCompatibleModels();

        System.out.println("Mobile Case ID: " + id1);
        System.out.println("Brand: " + brand1);
        System.out.println("Material: " + material1);
        System.out.println("Color: " + color1);
        System.out.println("Type: " + type1);
        System.out.println("Price: ₹" + price1);
        System.out.println("Compatible Models: " + compatibleModels1);
        System.out.println("------------------------------");

        System.out.println("Mobile Case ID: " + id2);
        System.out.println("Brand: " + brand2);
        System.out.println("Material: " + material2);
        System.out.println("Color: " + color2);
        System.out.println("Type: " + type2);
        System.out.println("Price: ₹" + price2);
        System.out.println("Compatible Models: " + compatibleModels2);
        System.out.println("------------------------------");

        System.out.println("Mobile Case ID: " + id3);
        System.out.println("Brand: " + brand3);
        System.out.println("Material: " + material3);
        System.out.println("Color: " + color3);
        System.out.println("Type: " + type3);
        System.out.println("Price: ₹" + price3);
        System.out.println("Compatible Models: " + compatibleModels3);
        System.out.println("------------------------------");

        System.out.println("Mobile Case ID: " + id4);
        System.out.println("Brand: " + brand4);
        System.out.println("Material: " + material4);
        System.out.println("Color: " + color4);
        System.out.println("Type: " + type4);
        System.out.println("Price: ₹" + price4);
        System.out.println("Compatible Models: " + compatibleModels4);
        System.out.println("------------------------------");


        System.out.println("Mobile Case ID: " + id5);
        System.out.println("Brand: " + brand5);
        System.out.println("Material: " + material5);
        System.out.println("Color: " + color5);
        System.out.println("Type: " + type5);
        System.out.println("Price: ₹" + price5);
        System.out.println("Compatible Models: " + compatibleModels5);
        System.out.println("------------------------------");
    }
}