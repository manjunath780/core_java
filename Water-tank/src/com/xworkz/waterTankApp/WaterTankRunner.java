package com.xworkz.waterTankApp;



import com.xworkz.waterTankApp.waterTank.WaterTank;

public class WaterTankRunner {

    public static void main(String[] args) {
        System.out.println("WaterTankRunner main started");

        WaterTank tank1 = new WaterTank();
        tank1.setTankId(101);
        tank1.setTankType("Overhead");
        tank1.setTankCapacity(1000.0);
        tank1.setTankMaterial("Plastic");
        tank1.setTankColor("Blue");
        tank1.setWaterHeated(true);

        int tankId1 = tank1.getTankId();
        String tankType1 = tank1.getTankType();
        double tankCapacity1 = tank1.getTankCapacity();
        String tankMaterial1 = tank1.getTankMaterial();
        String tankColor1 = tank1.getTankColor();
        boolean isWaterHeated1 = tank1.isWaterHeated();

        WaterTank tank2 = new WaterTank();
        tank2.setTankId(102);
        tank2.setTankType("Underground");
        tank2.setTankCapacity(2000.0);
        tank2.setTankMaterial("Concrete");
        tank2.setTankColor("Grey");
        tank2.setWaterHeated(false);

        int tankId2 = tank2.getTankId();
        String tankType2 = tank2.getTankType();
        double tankCapacity2 = tank2.getTankCapacity();
        String tankMaterial2 = tank2.getTankMaterial();
        String tankColor2 = tank2.getTankColor();
        boolean isWaterHeated2 = tank2.isWaterHeated();

        WaterTank tank3 = new WaterTank();
        tank3.setTankId(103);
        tank3.setTankType("Overhead");
        tank3.setTankCapacity(500.0);
        tank3.setTankMaterial("Steel");
        tank3.setTankColor("Silver");
        tank3.setWaterHeated(true);

        int tankId3 = tank3.getTankId();
        String tankType3 = tank3.getTankType();
        double tankCapacity3 = tank3.getTankCapacity();
        String tankMaterial3 = tank3.getTankMaterial();
        String tankColor3 = tank3.getTankColor();
        boolean isWaterHeated3 = tank3.isWaterHeated();

        WaterTank tank4 = new WaterTank();
        tank4.setTankId(104);
        tank4.setTankType("Overhead");
        tank4.setTankCapacity(1500.0);
        tank4.setTankMaterial("Fiberglass");
        tank4.setTankColor("Green");
        tank4.setWaterHeated(false);

        int tankId4 = tank4.getTankId();
        String tankType4 = tank4.getTankType();
        double tankCapacity4 = tank4.getTankCapacity();
        String tankMaterial4 = tank4.getTankMaterial();
        String tankColor4 = tank4.getTankColor();
        boolean isWaterHeated4 = tank4.isWaterHeated();

        WaterTank tank5 = new WaterTank();
        tank5.setTankId(105);
        tank5.setTankType("Underground");
        tank5.setTankCapacity(3000.0);
        tank5.setTankMaterial("Cement");
        tank5.setTankColor("Black");
        tank5.setWaterHeated(true);

        int tankId5 = tank5.getTankId();
        String tankType5 = tank5.getTankType();
        double tankCapacity5 = tank5.getTankCapacity();
        String tankMaterial5 = tank5.getTankMaterial();
        String tankColor5 = tank5.getTankColor();
        boolean isWaterHeated5 = tank5.isWaterHeated();

        System.out.println("Tank ID: " + tankId1);
        System.out.println("Tank Type: " + tankType1);
        System.out.println("Tank Capacity: " + tankCapacity1 + " liters");
        System.out.println("Tank Material: " + tankMaterial1);
        System.out.println("Tank Color: " + tankColor1);
        System.out.println("Is Water Heated? " + (isWaterHeated1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tank ID: " + tankId2);
        System.out.println("Tank Type: " + tankType2);
        System.out.println("Tank Capacity: " + tankCapacity2 + " liters");
        System.out.println("Tank Material: " + tankMaterial2);
        System.out.println("Tank Color: " + tankColor2);
        System.out.println("Is Water Heated? " + (isWaterHeated2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tank ID: " + tankId3);
        System.out.println("Tank Type: " + tankType3);
        System.out.println("Tank Capacity: " + tankCapacity3 + " liters");
        System.out.println("Tank Material: " + tankMaterial3);
        System.out.println("Tank Color: " + tankColor3);
        System.out.println("Is Water Heated? " + (isWaterHeated3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tank ID: " + tankId4);
        System.out.println("Tank Type: " + tankType4);
        System.out.println("Tank Capacity: " + tankCapacity4 + " liters");
        System.out.println("Tank Material: " + tankMaterial4);
        System.out.println("Tank Color: " + tankColor4);
        System.out.println("Is Water Heated? " + (isWaterHeated4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tank ID: " + tankId5);
        System.out.println("Tank Type: " + tankType5);
        System.out.println("Tank Capacity: " + tankCapacity5 + " liters");
        System.out.println("Tank Material: " + tankMaterial5);
        System.out.println("Tank Color: " + tankColor5);
        System.out.println("Is Water Heated? " + (isWaterHeated5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}

