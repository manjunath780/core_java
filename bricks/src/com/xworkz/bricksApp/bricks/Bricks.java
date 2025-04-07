package com.xworkz.bricksApp.bricks;


public class Bricks {

    private int id;
    private String material;
    private String color;
    private int size;
    private double weight;
    private String manufacturer;
    private boolean isFireResistant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isFireResistant() {
        return isFireResistant;
    }

    public void setFireResistant(boolean isFireResistant) {
        this.isFireResistant = isFireResistant;
    }
}
