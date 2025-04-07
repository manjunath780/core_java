package com.xworkz.bricksApp;


import com.xworkz.bricksApp.bricks.Bricks;

public class BricksRunner {

    public static void main(String[] args) {
        System.out.println("BricksRunner main started");

        Bricks brick1 = new Bricks();
        brick1.setId(1);
        brick1.setMaterial("Clay");
        brick1.setColor("Red");
        brick1.setSize(20);
        brick1.setWeight(2.5);
        brick1.setManufacturer("ABC Bricks");
        brick1.setFireResistant(true);

        int id1 = brick1.getId();
        String material1 = brick1.getMaterial();
        String color1 = brick1.getColor();
        int size1 = brick1.getSize();
        double weight1 = brick1.getWeight();
        String manufacturer1 = brick1.getManufacturer();
        boolean isFireResistant1 = brick1.isFireResistant();

        Bricks brick2 = new Bricks();
        brick2.setId(2);
        brick2.setMaterial("Concrete");
        brick2.setColor("Grey");
        brick2.setSize(25);
        brick2.setWeight(3.0);
        brick2.setManufacturer("XYZ Bricks");
        brick2.setFireResistant(false);

        int id2 = brick2.getId();
        String material2 = brick2.getMaterial();
        String color2 = brick2.getColor();
        int size2 = brick2.getSize();
        double weight2 = brick2.getWeight();
        String manufacturer2 = brick2.getManufacturer();
        boolean isFireResistant2 = brick2.isFireResistant();

        Bricks brick3 = new Bricks();
        brick3.setId(3);
        brick3.setMaterial("Sandstone");
        brick3.setColor("Brown");
        brick3.setSize(30);
        brick3.setWeight(3.5);
        brick3.setManufacturer("PQR Bricks");
        brick3.setFireResistant(true);

        int id3 = brick3.getId();
        String material3 = brick3.getMaterial();
        String color3 = brick3.getColor();
        int size3 = brick3.getSize();
        double weight3 = brick3.getWeight();
        String manufacturer3 = brick3.getManufacturer();
        boolean isFireResistant3 = brick3.isFireResistant();

        Bricks brick4 = new Bricks();
        brick4.setId(4);
        brick4.setMaterial("Limestone");
        brick4.setColor("Yellow");
        brick4.setSize(18);
        brick4.setWeight(2.2);
        brick4.setManufacturer("LMN Bricks");
        brick4.setFireResistant(true);

        int id4 = brick4.getId();
        String material4 = brick4.getMaterial();
        String color4 = brick4.getColor();
        int size4 = brick4.getSize();
        double weight4 = brick4.getWeight();
        String manufacturer4 = brick4.getManufacturer();
        boolean isFireResistant4 = brick4.isFireResistant();

        Bricks brick5 = new Bricks();
        brick5.setId(5);
        brick5.setMaterial("Fly Ash");
        brick5.setColor("Black");
        brick5.setSize(22);
        brick5.setWeight(2.8);
        brick5.setManufacturer("DEF Bricks");
        brick5.setFireResistant(false);

        int id5 = brick5.getId();
        String material5 = brick5.getMaterial();
        String color5 = brick5.getColor();
        int size5 = brick5.getSize();
        double weight5 = brick5.getWeight();
        String manufacturer5 = brick5.getManufacturer();
        boolean isFireResistant5 = brick5.isFireResistant();

        System.out.println("Brick ID: " + id1);
        System.out.println("Material: " + material1);
        System.out.println("Color: " + color1);
        System.out.println("Size: " + size1 + " cm");
        System.out.println("Weight: " + weight1 + " kg");
        System.out.println("Manufacturer: " + manufacturer1);
        System.out.println("Fire Resistant: " + (isFireResistant1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Brick ID: " + id2);
        System.out.println("Material: " + material2);
        System.out.println("Color: " + color2);
        System.out.println("Size: " + size2 + " cm");
        System.out.println("Weight: " + weight2 + " kg");
        System.out.println("Manufacturer: " + manufacturer2);
        System.out.println("Fire Resistant: " + (isFireResistant2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Brick ID: " + id3);
        System.out.println("Material: " + material3);
        System.out.println("Color: " + color3);
        System.out.println("Size: " + size3 + " cm");
        System.out.println("Weight: " + weight3 + " kg");
        System.out.println("Manufacturer: " + manufacturer3);
        System.out.println("Fire Resistant: " + (isFireResistant3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Brick ID: " + id4);
        System.out.println("Material: " + material4);
        System.out.println("Color: " + color4);
        System.out.println("Size: " + size4 + " cm");
        System.out.println("Weight: " + weight4 + " kg");
        System.out.println("Manufacturer: " + manufacturer4);
        System.out.println("Fire Resistant: " + (isFireResistant4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Brick ID: " + id5);
        System.out.println("Material: " + material5);
        System.out.println("Color: " + color5);
        System.out.println("Size: " + size5 + " cm");
        System.out.println("Weight: " + weight5 + " kg");
        System.out.println("Manufacturer: " + manufacturer5);
        System.out.println("Fire Resistant: " + (isFireResistant5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
