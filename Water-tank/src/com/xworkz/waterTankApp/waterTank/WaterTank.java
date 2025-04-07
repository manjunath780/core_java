package com.xworkz.waterTankApp.waterTank;

public class WaterTank {

    private int tankId;
    private String tankType;
    private double tankCapacity;
    private String tankMaterial;
    private String tankColor;
    private boolean isWaterHeated;

    public int getTankId() {
        return tankId;
    }

    public void setTankId(int tankId) {
        this.tankId = tankId;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String getTankMaterial() {
        return tankMaterial;
    }

    public void setTankMaterial(String tankMaterial) {
        this.tankMaterial = tankMaterial;
    }

    public String getTankColor() {
        return tankColor;
    }

    public void setTankColor(String tankColor) {
        this.tankColor = tankColor;
    }

    public boolean isWaterHeated() {
        return isWaterHeated;
    }

    public void setWaterHeated(boolean waterHeated) {
        isWaterHeated = waterHeated;
    }
}

