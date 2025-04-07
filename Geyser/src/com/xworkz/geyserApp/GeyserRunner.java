package com.xworkz.geyserApp;


import com.xworkz.geyserApp.geyser.Geyser;

public class GeyserRunner {

    public static void main(String[] args) {
        System.out.println("GeyserRunner main started");

        Geyser geyser1 = new Geyser();
        geyser1.setGeyserId(101);
        geyser1.setGeyserBrand("Bajaj");
        geyser1.setGeyserColor("White");
        geyser1.setGeyserCapacity(25.0);
        geyser1.setGeyserPrice(4999.99);
        geyser1.setElectric(true);
        geyser1.setGeyserType("Storage");

        int geyserId1 = geyser1.getGeyserId();
        String geyserBrand1 = geyser1.getGeyserBrand();
        String geyserColor1 = geyser1.getGeyserColor();
        double geyserCapacity1 = geyser1.getGeyserCapacity();
        double geyserPrice1 = geyser1.getGeyserPrice();
        boolean isElectric1 = geyser1.isElectric();
        String geyserType1 = geyser1.getGeyserType();

        Geyser geyser2 = new Geyser();
        geyser2.setGeyserId(102);
        geyser2.setGeyserBrand("Havells");
        geyser2.setGeyserColor("Silver");
        geyser2.setGeyserCapacity(15.0);
        geyser2.setGeyserPrice(3999.50);
        geyser2.setElectric(false);
        geyser2.setGeyserType("Instant");

        int geyserId2 = geyser2.getGeyserId();
        String geyserBrand2 = geyser2.getGeyserBrand();
        String geyserColor2 = geyser2.getGeyserColor();
        double geyserCapacity2 = geyser2.getGeyserCapacity();
        double geyserPrice2 = geyser2.getGeyserPrice();
        boolean isElectric2 = geyser2.isElectric();
        String geyserType2 = geyser2.getGeyserType();

        Geyser geyser3 = new Geyser();
        geyser3.setGeyserId(103);
        geyser3.setGeyserBrand("Crompton");
        geyser3.setGeyserColor("Blue");
        geyser3.setGeyserCapacity(10.0);
        geyser3.setGeyserPrice(2999.99);
        geyser3.setElectric(true);
        geyser3.setGeyserType("Instant");

        int geyserId3 = geyser3.getGeyserId();
        String geyserBrand3 = geyser3.getGeyserBrand();
        String geyserColor3 = geyser3.getGeyserColor();
        double geyserCapacity3 = geyser3.getGeyserCapacity();
        double geyserPrice3 = geyser3.getGeyserPrice();
        boolean isElectric3 = geyser3.isElectric();
        String geyserType3 = geyser3.getGeyserType();

        Geyser geyser4 = new Geyser();
        geyser4.setGeyserId(104);
        geyser4.setGeyserBrand("V-Guard");
        geyser4.setGeyserColor("Grey");
        geyser4.setGeyserCapacity(30.0);
        geyser4.setGeyserPrice(5499.99);
        geyser4.setElectric(true);
        geyser4.setGeyserType("Storage");

        int geyserId4 = geyser4.getGeyserId();
        String geyserBrand4 = geyser4.getGeyserBrand();
        String geyserColor4 = geyser4.getGeyserColor();
        double geyserCapacity4 = geyser4.getGeyserCapacity();
        double geyserPrice4 = geyser4.getGeyserPrice();
        boolean isElectric4 = geyser4.isElectric();
        String geyserType4 = geyser4.getGeyserType();

        Geyser geyser5 = new Geyser();
        geyser5.setGeyserId(105);
        geyser5.setGeyserBrand("Lifelong");
        geyser5.setGeyserColor("Black");
        geyser5.setGeyserCapacity(20.0);
        geyser5.setGeyserPrice(3999.00);
        geyser5.setElectric(false);
        geyser5.setGeyserType("Storage");

        int geyserId5 = geyser5.getGeyserId();
        String geyserBrand5 = geyser5.getGeyserBrand();
        String geyserColor5 = geyser5.getGeyserColor();
        double geyserCapacity5 = geyser5.getGeyserCapacity();
        double geyserPrice5 = geyser5.getGeyserPrice();
        boolean isElectric5 = geyser5.isElectric();
        String geyserType5 = geyser5.getGeyserType();

        System.out.println("Geyser ID: " + geyserId1);
        System.out.println("Geyser Brand: " + geyserBrand1);
        System.out.println("Geyser Color: " + geyserColor1);
        System.out.println("Geyser Capacity: " + geyserCapacity1 + " Liters");
        System.out.println("Geyser Price: ₹" + geyserPrice1);
        System.out.println("Is Electric: " + (isElectric1 ? "Yes" : "No"));
        System.out.println("Geyser Type: " + geyserType1);
        System.out.println("------------------------------");

        System.out.println("Geyser ID: " + geyserId2);
        System.out.println("Geyser Brand: " + geyserBrand2);
        System.out.println("Geyser Color: " + geyserColor2);
        System.out.println("Geyser Capacity: " + geyserCapacity2 + " Liters");
        System.out.println("Geyser Price: ₹" + geyserPrice2);
        System.out.println("Is Electric: " + (isElectric2 ? "Yes" : "No"));
        System.out.println("Geyser Type: " + geyserType2);
        System.out.println("------------------------------");

        System.out.println("Geyser ID: " + geyserId3);
        System.out.println("Geyser Brand: " + geyserBrand3);
        System.out.println("Geyser Color: " + geyserColor3);
        System.out.println("Geyser Capacity: " + geyserCapacity3 + " Liters");
        System.out.println("Geyser Price: ₹" + geyserPrice3);
        System.out.println("Is Electric: " + (isElectric3 ? "Yes" : "No"));
        System.out.println("Geyser Type: " + geyserType3);
        System.out.println("------------------------------");

        System.out.println("Geyser ID: " + geyserId4);
        System.out.println("Geyser Brand: " + geyserBrand4);
        System.out.println("Geyser Color: " + geyserColor4);
        System.out.println("Geyser Capacity: " + geyserCapacity4 + " Liters");
        System.out.println("Geyser Price: ₹" + geyserPrice4);
        System.out.println("Is Electric: " + (isElectric4 ? "Yes" : "No"));
        System.out.println("Geyser Type: " + geyserType4);
        System.out.println("------------------------------");

        System.out.println("Geyser ID: " + geyserId5);
        System.out.println("Geyser Brand: " + geyserBrand5);
        System.out.println("Geyser Color: " + geyserColor5);
        System.out.println("Geyser Capacity: " + geyserCapacity5 + " Liters");
        System.out.println("Geyser Price: ₹" + geyserPrice5);
        System.out.println("Is Electric: " + (isElectric5 ? "Yes" : "No"));
        System.out.println("Geyser Type: " + geyserType5);
        System.out.println("------------------------------");

    }
}
