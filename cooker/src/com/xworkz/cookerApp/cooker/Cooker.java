package com.xworkz.cookerApp.cooker;


public class Cooker {
    private int cookerId;
    private String cookerBrand;
    private String cookerType;
    private double cookerCapacity;
    private double cookerPrice;
    private boolean isElectric;


    public int getCookerId() {
        return cookerId;
    }

    public void setCookerId(int cookerId) {
        this.cookerId = cookerId;
    }

    public String getCookerBrand() {
        return cookerBrand;
    }

    public void setCookerBrand(String cookerBrand) {
        this.cookerBrand = cookerBrand;
    }

    public String getCookerType() {
        return cookerType;
    }

    public void setCookerType(String cookerType) {
        this.cookerType = cookerType;
    }

    public double getCookerCapacity() {
        return cookerCapacity;
    }

    public void setCookerCapacity(double cookerCapacity) {
        this.cookerCapacity = cookerCapacity;
    }

    public double getCookerPrice() {
        return cookerPrice;
    }

    public void setCookerPrice(double cookerPrice) {
        this.cookerPrice = cookerPrice;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
