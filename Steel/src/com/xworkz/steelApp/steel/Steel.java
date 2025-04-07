package com.xworkz.steelApp.steel;

public class Steel {

    private int id;
    private String name;
    private String type;
    private double pricePerKg;
    private double weight;
    private boolean isRecycled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRecycled() {
        return isRecycled;
    }

    public void setRecycled(boolean isRecycled) {
        this.isRecycled = isRecycled;
    }
}
