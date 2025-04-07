package com.xworkz.majigeApp;


import com.xworkz.majigeApp.majige.Majige;

public class MajigeRunner {

    public static void main(String[] args) {
        System.out.println("MajigeRunner main started");

        Majige majige1 = new Majige();
        majige1.setId(101);
        majige1.setName("Sweet Majige");
        majige1.setType("Sweet");
        majige1.setWeight(500.0);
        majige1.setFlavor("Sweet");
        majige1.setPrice(120.50);
        majige1.setRegion("Karnataka");

        int id1 = majige1.getId();
        String name1 = majige1.getName();
        String type1 = majige1.getType();
        double weight1 = majige1.getWeight();
        String flavor1 = majige1.getFlavor();
        double price1 = majige1.getPrice();
        String region1 = majige1.getRegion();

        Majige majige2 = new Majige();
        majige2.setId(102);
        majige2.setName("Sour Majige");
        majige2.setType("Sour");
        majige2.setWeight(600.0);
        majige2.setFlavor("Sour");
        majige2.setPrice(130.75);
        majige2.setRegion("Maharashtra");

        int id2 = majige2.getId();
        String name2 = majige2.getName();
        String type2 = majige2.getType();
        double weight2 = majige2.getWeight();
        String flavor2 = majige2.getFlavor();
        double price2 = majige2.getPrice();
        String region2 = majige2.getRegion();

        Majige majige3 = new Majige();
        majige3.setId(103);
        majige3.setName("Spicy Majige");
        majige3.setType("Spicy");
        majige3.setWeight(700.0);
        majige3.setFlavor("Spicy");
        majige3.setPrice(140.25);
        majige3.setRegion("Andhra Pradesh");

        int id3 = majige3.getId();
        String name3 = majige3.getName();
        String type3 = majige3.getType();
        double weight3 = majige3.getWeight();
        String flavor3 = majige3.getFlavor();
        double price3 = majige3.getPrice();
        String region3 = majige3.getRegion();

        Majige majige4 = new Majige();
        majige4.setId(104);
        majige4.setName("Bitter Majige");
        majige4.setType("Bitter");
        majige4.setWeight(400.0);
        majige4.setFlavor("Bitter");
        majige4.setPrice(110.80);
        majige4.setRegion("Tamil Nadu");

        int id4 = majige4.getId();
        String name4 = majige4.getName();
        String type4 = majige4.getType();
        double weight4 = majige4.getWeight();
        String flavor4 = majige4.getFlavor();
        double price4 = majige4.getPrice();
        String region4 = majige4.getRegion();

        Majige majige5 = new Majige();
        majige5.setId(105);
        majige5.setName("Tangy Majige");
        majige5.setType("Tangy");
        majige5.setWeight(450.0);
        majige5.setFlavor("Tangy");
        majige5.setPrice(125.65);
        majige5.setRegion("Kerala");

        int id5 = majige5.getId();
        String name5 = majige5.getName();
        String type5 = majige5.getType();
        double weight5 = majige5.getWeight();
        String flavor5 = majige5.getFlavor();
        double price5 = majige5.getPrice();
        String region5 = majige5.getRegion();

        System.out.println("Majige ID: " + id1);
        System.out.println("Majige Name: " + name1);
        System.out.println("Majige Type: " + type1);
        System.out.println("Majige Weight: " + weight1 + " grams");
        System.out.println("Majige Flavor: " + flavor1);
        System.out.println("Majige Price: ₹" + price1);
        System.out.println("Majige Region: " + region1);
        System.out.println("------------------------------");

        System.out.println("Majige ID: " + id2);
        System.out.println("Majige Name: " + name2);
        System.out.println("Majige Type: " + type2);
        System.out.println("Majige Weight: " + weight2 + " grams");
        System.out.println("Majige Flavor: " + flavor2);
        System.out.println("Majige Price: ₹" + price2);
        System.out.println("Majige Region: " + region2);
        System.out.println("------------------------------");

        System.out.println("Majige ID: " + id3);
        System.out.println("Majige Name: " + name3);
        System.out.println("Majige Type: " + type3);
        System.out.println("Majige Weight: " + weight3 + " grams");
        System.out.println("Majige Flavor: " + flavor3);
        System.out.println("Majige Price: ₹" + price3);
        System.out.println("Majige Region: " + region3);
        System.out.println("------------------------------");

        System.out.println("Majige ID: " + id4);
        System.out.println("Majige Name: " + name4);
        System.out.println("Majige Type: " + type4);
        System.out.println("Majige Weight: " + weight4 + " grams");
        System.out.println("Majige Flavor: " + flavor4);
        System.out.println("Majige Price: ₹" + price4);
        System.out.println("Majige Region: " + region4);
        System.out.println("------------------------------");

        System.out.println("Majige ID: " + id5);
        System.out.println("Majige Name: " + name5);
        System.out.println("Majige Type: " + type5);
        System.out.println("Majige Weight: " + weight5 + " grams");
        System.out.println("Majige Flavor: " + flavor5);
        System.out.println("Majige Price: ₹" + price5);
        System.out.println("Majige Region: " + region5);
        System.out.println("------------------------------");
    }
}
