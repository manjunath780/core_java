package com.xwokz.chalkApp;


import com.xwokz.chalkApp.chalk.Chalk;

public class ChalkRunner {

    public static void main(String[] args) {
        System.out.println("ChalkRunner main started");

        Chalk chalk1 = new Chalk();
        chalk1.setId(1);
        chalk1.setBrand("Natraj");
        chalk1.setColor("White");
        chalk1.setPrice(25.50);
        chalk1.setQuantity(10);
        chalk1.setDustFree(true);

        int id1 = chalk1.getId();
        String brand1 = chalk1.getBrand();
        String color1 = chalk1.getColor();
        double price1 = chalk1.getPrice();
        int quantity1 = chalk1.getQuantity();
        boolean isDustFree1 = chalk1.isDustFree();

        Chalk chalk2 = new Chalk();
        chalk2.setId(2);
        chalk2.setBrand("Classmate");
        chalk2.setColor("Yellow");
        chalk2.setPrice(30.00);
        chalk2.setQuantity(12);
        chalk2.setDustFree(false);

        int id2 = chalk2.getId();
        String brand2 = chalk2.getBrand();
        String color2 = chalk2.getColor();
        double price2 = chalk2.getPrice();
        int quantity2 = chalk2.getQuantity();
        boolean isDustFree2 = chalk2.isDustFree();

        Chalk chalk3 = new Chalk();
        chalk3.setId(3);
        chalk3.setBrand("Camlin");
        chalk3.setColor("White");
        chalk3.setPrice(20.75);
        chalk3.setQuantity(15);
        chalk3.setDustFree(true);

        int id3 = chalk3.getId();
        String brand3 = chalk3.getBrand();
        String color3 = chalk3.getColor();
        double price3 = chalk3.getPrice();
        int quantity3 = chalk3.getQuantity();
        boolean isDustFree3 = chalk3.isDustFree();

        Chalk chalk4 = new Chalk();
        chalk4.setId(4);
        chalk4.setBrand("Apsara");
        chalk4.setColor("White");
        chalk4.setPrice(28.50);
        chalk4.setQuantity(20);
        chalk4.setDustFree(false);

        int id4 = chalk4.getId();
        String brand4 = chalk4.getBrand();
        String color4 = chalk4.getColor();
        double price4 = chalk4.getPrice();
        int quantity4 = chalk4.getQuantity();
        boolean isDustFree4 = chalk4.isDustFree();

        Chalk chalk5 = new Chalk();
        chalk5.setId(5);
        chalk5.setBrand("Doms");
        chalk5.setColor("White");
        chalk5.setPrice(18.99);
        chalk5.setQuantity(18);
        chalk5.setDustFree(true);

        int id5 = chalk5.getId();
        String brand5 = chalk5.getBrand();
        String color5 = chalk5.getColor();
        double price5 = chalk5.getPrice();
        int quantity5 = chalk5.getQuantity();
        boolean isDustFree5 = chalk5.isDustFree();

        System.out.println("Chalk ID: " + id1);
        System.out.println("Brand: " + brand1);
        System.out.println("Color: " + color1);
        System.out.println("Price: ₹" + price1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Dust Free: " + (isDustFree1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Chalk ID: " + id2);
        System.out.println("Brand: " + brand2);
        System.out.println("Color: " + color2);
        System.out.println("Price: ₹" + price2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Dust Free: " + (isDustFree2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Chalk ID: " + id3);
        System.out.println("Brand: " + brand3);
        System.out.println("Color: " + color3);
        System.out.println("Price: ₹" + price3);
        System.out.println("Quantity: " + quantity3);
        System.out.println("Dust Free: " + (isDustFree3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Chalk ID: " + id4);
        System.out.println("Brand: " + brand4);
        System.out.println("Color: " + color4);
        System.out.println("Price: ₹" + price4);
        System.out.println("Quantity: " + quantity4);
        System.out.println("Dust Free: " + (isDustFree4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Chalk ID: " + id5);
        System.out.println("Brand: " + brand5);
        System.out.println("Color: " + color5);
        System.out.println("Price: ₹" + price5);
        System.out.println("Quantity: " + quantity5);
        System.out.println("Dust Free: " + (isDustFree5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
