package com.xwokz.chalkApp.chalk;



public class Chalk {

    private int id;
    private String brand;
    private String color;
    private double price;
    private int quantity;
    private boolean isDustFree;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDustFree() {
        return isDustFree;
    }

    public void setDustFree(boolean isDustFree) {
        this.isDustFree = isDustFree;
    }
}
