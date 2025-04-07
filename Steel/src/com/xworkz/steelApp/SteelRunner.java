package com.xworkz.steelApp;

import com.xworkz.steelApp.steel.Steel;

public class SteelRunner {

    public static void main(String[] args) {
        System.out.println("SteelRunner main started");

        Steel steel1 = new Steel();
        steel1.setId(1);
        steel1.setName("Tata Steel");
        steel1.setType("Stainless Steel");
        steel1.setPricePerKg(75.50);
        steel1.setWeight(1000);
        steel1.setRecycled(true);

        int id1 = steel1.getId();
        String name1 = steel1.getName();
        String type1 = steel1.getType();
        double pricePerKg1 = steel1.getPricePerKg();
        double weight1 = steel1.getWeight();
        boolean isRecycled1 = steel1.isRecycled();

        Steel steel2 = new Steel();
        steel2.setId(2);
        steel2.setName("JSW Steel");
        steel2.setType("Mild Steel");
        steel2.setPricePerKg(50.25);
        steel2.setWeight(1200);
        steel2.setRecycled(false);

        int id2 = steel2.getId();
        String name2 = steel2.getName();
        String type2 = steel2.getType();
        double pricePerKg2 = steel2.getPricePerKg();
        double weight2 = steel2.getWeight();
        boolean isRecycled2 = steel2.isRecycled();

        Steel steel3 = new Steel();
        steel3.setId(3);
        steel3.setName("Essar Steel");
        steel3.setType("Carbon Steel");
        steel3.setPricePerKg(80.00);
        steel3.setWeight(1500);
        steel3.setRecycled(true);

        int id3 = steel3.getId();
        String name3 = steel3.getName();
        String type3 = steel3.getType();
        double pricePerKg3 = steel3.getPricePerKg();
        double weight3 = steel3.getWeight();
        boolean isRecycled3 = steel3.isRecycled();

        Steel steel4 = new Steel();
        steel4.setId(4);
        steel4.setName("SAIL Steel");
        steel4.setType("Alloy Steel");
        steel4.setPricePerKg(90.75);
        steel4.setWeight(800);
        steel4.setRecycled(false);

        int id4 = steel4.getId();
        String name4 = steel4.getName();
        String type4 = steel4.getType();
        double pricePerKg4 = steel4.getPricePerKg();
        double weight4 = steel4.getWeight();
        boolean isRecycled4 = steel4.isRecycled();

        Steel steel5 = new Steel();
        steel5.setId(5);
        steel5.setName("ArcelorMittal");
        steel5.setType("Tool Steel");
        steel5.setPricePerKg(120.00);
        steel5.setWeight(2000);
        steel5.setRecycled(true);

        int id5 = steel5.getId();
        String name5 = steel5.getName();
        String type5 = steel5.getType();
        double pricePerKg5 = steel5.getPricePerKg();
        double weight5 = steel5.getWeight();
        boolean isRecycled5 = steel5.isRecycled();

        System.out.println("Steel ID: " + id1);
        System.out.println("Name: " + name1);
        System.out.println("Type: " + type1);
        System.out.println("Price per Kg: ₹" + pricePerKg1);
        System.out.println("Weight: " + weight1 + " Kg");
        System.out.println("Recycled: " + (isRecycled1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Steel ID: " + id2);
        System.out.println("Name: " + name2);
        System.out.println("Type: " + type2);
        System.out.println("Price per Kg: ₹" + pricePerKg2);
        System.out.println("Weight: " + weight2 + " Kg");
        System.out.println("Recycled: " + (isRecycled2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Steel ID: " + id3);
        System.out.println("Name: " + name3);
        System.out.println("Type: " + type3);
        System.out.println("Price per Kg: ₹" + pricePerKg3);
        System.out.println("Weight: " + weight3 + " Kg");
        System.out.println("Recycled: " + (isRecycled3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Steel ID: " + id4);
        System.out.println("Name: " + name4);
        System.out.println("Type: " + type4);
        System.out.println("Price per Kg: ₹" + pricePerKg4);
        System.out.println("Weight: " + weight4 + " Kg");
        System.out.println("Recycled: " + (isRecycled4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Steel ID: " + id5);
        System.out.println("Name: " + name5);
        System.out.println("Type: " + type5);
        System.out.println("Price per Kg: ₹" + pricePerKg5);
        System.out.println("Weight: " + weight5 + " Kg");
        System.out.println("Recycled: " + (isRecycled5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}

