package com.xworkz.simCardApp;


import com.xworkz.simCardApp.simC
ard.SimCard;

public class SimCardRunner {

    public static void main(String[] args) {
        System.out.println("SimCardRunner main started");

        SimCard simCard1 = new SimCard();
        simCard1.setId(101);
        simCard1.setBrand("Jio");
        simCard1.setType("4G");
        simCard1.setNetwork("Jio Network");
        simCard1.setPrice(199.99);
        simCard1.setActivationDate("01-01-2023");
        simCard1.setPrepaid(true);

        int id1 = simCard1.getId();
        String brand1 = simCard1.getBrand();
        String type1 = simCard1.getType();
        String network1 = simCard1.getNetwork();
        double price1 = simCard1.getPrice();
        String activationDate1 = simCard1.getActivationDate();
        boolean isPrepaid1 = simCard1.isPrepaid();

        SimCard simCard2 = new SimCard();
        simCard2.setId(102);
        simCard2.setBrand("Airtel");
        simCard2.setType("4G");
        simCard2.setNetwork("Airtel Network");
        simCard2.setPrice(249.99);
        simCard2.setActivationDate("05-02-2023");
        simCard2.setPrepaid(false);

        int id2 = simCard2.getId();
        String brand2 = simCard2.getBrand();
        String type2 = simCard2.getType();
        String network2 = simCard2.getNetwork();
        double price2 = simCard2.getPrice();
        String activationDate2 = simCard2.getActivationDate();
        boolean isPrepaid2 = simCard2.isPrepaid();

        SimCard simCard3 = new SimCard();
        simCard3.setId(103);
        simCard3.setBrand("Vodafone");
        simCard3.setType("3G");
        simCard3.setNetwork("Vodafone Network");
        simCard3.setPrice(299.99);
        simCard3.setActivationDate("15-03-2023");
        simCard3.setPrepaid(true);

        int id3 = simCard3.getId();
        String brand3 = simCard3.getBrand();
        String type3 = simCard3.getType();
        String network3 = simCard3.getNetwork();
        double price3 = simCard3.getPrice();
        String activationDate3 = simCard3.getActivationDate();
        boolean isPrepaid3 = simCard3.isPrepaid();

        SimCard simCard4 = new SimCard();
        simCard4.setId(104);
        simCard4.setBrand("BSNL");
        simCard4.setType("4G");
        simCard4.setNetwork("BSNL Network");
        simCard4.setPrice(159.99);
        simCard4.setActivationDate("20-04-2023");
        simCard4.setPrepaid(false);

        int id4 = simCard4.getId();
        String brand4 = simCard4.getBrand();
        String type4 = simCard4.getType();
        String network4 = simCard4.getNetwork();
        double price4 = simCard4.getPrice();
        String activationDate4 = simCard4.getActivationDate();
        boolean isPrepaid4 = simCard4.isPrepaid();

        SimCard simCard5 = new SimCard();
        simCard5.setId(105);
        simCard5.setBrand("Idea");
        simCard5.setType("4G");
        simCard5.setNetwork("Idea Network");
        simCard5.setPrice(199.99);
        simCard5.setActivationDate("10-05-2023");
        simCard5.setPrepaid(true);

        int id5 = simCard5.getId();
        String brand5 = simCard5.getBrand();
        String type5 = simCard5.getType();
        String network5 = simCard5.getNetwork();
        double price5 = simCard5.getPrice();
        String activationDate5 = simCard5.getActivationDate();
        boolean isPrepaid5 = simCard5.isPrepaid();

        System.out.println("SimCard ID: " + id1);
        System.out.println("Brand: " + brand1);
        System.out.println("Type: " + type1);
        System.out.println("Network: " + network1);
        System.out.println("Price: ₹" + price1);
        System.out.println("Activation Date: " + activationDate1);
        System.out.println("Prepaid: " + (isPrepaid1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("SimCard ID: " + id2);
        System.out.println("Brand: " + brand2);
        System.out.println("Type: " + type2);
        System.out.println("Network: " + network2);
        System.out.println("Price: ₹" + price2);
        System.out.println("Activation Date: " + activationDate2);
        System.out.println("Prepaid: " + (isPrepaid2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("SimCard ID: " + id3);
        System.out.println("Brand: " + brand3);
        System.out.println("Type: " + type3);
        System.out.println("Network: " + network3);
        System.out.println("Price: ₹" + price3);
        System.out.println("Activation Date: " + activationDate3);
        System.out.println("Prepaid: " + (isPrepaid3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("SimCard ID: " + id4);
        System.out.println("Brand: " + brand4);
        System.out.println("Type: " + type4);
        System.out.println("Network: " + network4);
        System.out.println("Price: ₹" + price4);
        System.out.println("Activation Date: " + activationDate4);
        System.out.println("Prepaid: " + (isPrepaid4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("SimCard ID: " + id5);
        System.out.println("Brand: " + brand5);
        System.out.println("Type: " + type5);
        System.out.println("Network: " + network5);
        System.out.println("Price: ₹" + price5);
        System.out.println("Activation Date: " + activationDate5);
        System.out.println("Prepaid: " + (isPrepaid5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}