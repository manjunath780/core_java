package com.xworkz.geyserApp.geyser;


public class Geyser {

    private int geyserId;
    private String geyserBrand;
    private String geyserColor;
    private double geyserCapacity;
    private double geyserPrice;
    private boolean isElectric;
    private String geyserType;

    public Geyser() {
    }

    public int getGeyserId() {
        return geyserId;
    }

    public void setGeyserId(int geyserId) {
        this.geyserId = geyserId;
    }

    public String getGeyserBrand() {
        return geyserBrand;
    }

    public void setGeyserBrand(String geyserBrand) {
        this.geyserBrand = geyserBrand;
    }

    public String getGeyserColor() {
        return geyserColor;
    }

    public void setGeyserColor(String geyserColor) {
        this.geyserColor = geyserColor;
    }

    public double getGeyserCapacity() {
        return geyserCapacity;
    }

    public void setGeyserCapacity(double geyserCapacity) {
        this.geyserCapacity = geyserCapacity;
    }

    public double getGeyserPrice() {
        return geyserPrice;
    }

    public void setGeyserPrice(double geyserPrice) {
        this.geyserPrice = geyserPrice;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getGeyserType() {
        return geyserType;
    }

    public void setGeyserType(String geyserType) {
        this.geyserType = geyserType;
    }

}
