package com.xworkz.mobileCaseApp.mobileCase;


public class MobileCase {

    private int id;
    private String brand;
    private String material;
    private String color;
    private String type;
    private double price;
    private String compatibleModels;

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompatibleModels() {
        return compatibleModels;
    }

    public void setCompatibleModels(String compatibleModels) {
        this.compatibleModels = compatibleModels;
    }
}
