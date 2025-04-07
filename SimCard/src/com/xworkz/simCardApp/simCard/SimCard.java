package com.xworkz.simCardApp.simCard;



public class SimCard {

    private int id;
    private String brand;
    private String type;
    private String network;
    private double price;
    private String activationDate;
    private boolean isPrepaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public boolean isPrepaid() {
        return isPrepaid;
    }

    public void setPrepaid(boolean prepaid) {
        isPrepaid = prepaid;
    }
}
