package com.xworkz.cropsApp;

import com.xworkz.cropsApp.crops.Crops;

public class CropsRunner {

    public static void main(String[] args) {
        System.out.println("CropsRunner main started");

        Crops crop1 = new Crops();
        crop1.setCropId(101);
        crop1.setCropName("Wheat");
        crop1.setCropArea(2000.5);
        crop1.setCropSeason("Rabi");
        crop1.setCropType("Cereal");
        crop1.setCropYield(1500.0);
        crop1.setCropRegion("North India");

        int cropId1 = crop1.getCropId();
        String cropName1 = crop1.getCropName();
        double cropArea1 = crop1.getCropArea();
        String cropSeason1 = crop1.getCropSeason();
        String cropType1 = crop1.getCropType();
        double cropYield1 = crop1.getCropYield();
        String cropRegion1 = crop1.getCropRegion();

        Crops crop2 = new Crops();
        crop2.setCropId(102);
        crop2.setCropName("Rice");
        crop2.setCropArea(3000.0);
        crop2.setCropSeason("Kharif");
        crop2.setCropType("Cereal");
        crop2.setCropYield(2500.0);
        crop2.setCropRegion("South India");

        int cropId2 = crop2.getCropId();
        String cropName2 = crop2.getCropName();
        double cropArea2 = crop2.getCropArea();
        String cropSeason2 = crop2.getCropSeason();
        String cropType2 = crop2.getCropType();
        double cropYield2 = crop2.getCropYield();
        String cropRegion2 = crop2.getCropRegion();

        Crops crop3 = new Crops();
        crop3.setCropId(103);
        crop3.setCropName("Sugarcane");
        crop3.setCropArea(1500.0);
        crop3.setCropSeason("Annual");
        crop3.setCropType("Cash Crop");
        crop3.setCropYield(3000.0);
        crop3.setCropRegion("West India");

        int cropId3 = crop3.getCropId();
        String cropName3 = crop3.getCropName();
        double cropArea3 = crop3.getCropArea();
        String cropSeason3 = crop3.getCropSeason();
        String cropType3 = crop3.getCropType();
        double cropYield3 = crop3.getCropYield();
        String cropRegion3 = crop3.getCropRegion();

        Crops crop4 = new Crops();
        crop4.setCropId(104);
        crop4.setCropName("Cotton");
        crop4.setCropArea(4000.0);
        crop4.setCropSeason("Kharif");
        crop4.setCropType("Cash Crop");
        crop4.setCropYield(1800.0);
        crop4.setCropRegion("Central India");

        int cropId4 = crop4.getCropId();
        String cropName4 = crop4.getCropName();
        double cropArea4 = crop4.getCropArea();
        String cropSeason4 = crop4.getCropSeason();
        String cropType4 = crop4.getCropType();
        double cropYield4 = crop4.getCropYield();
        String cropRegion4 = crop4.getCropRegion();

        Crops crop5 = new Crops();
        crop5.setCropId(105);
        crop5.setCropName("Maize");
        crop5.setCropArea(1200.0);
        crop5.setCropSeason("Kharif");
        crop5.setCropType("Cereal");
        crop5.setCropYield(2000.0);
        crop5.setCropRegion("East India");

        int cropId5 = crop5.getCropId();
        String cropName5 = crop5.getCropName();
        double cropArea5 = crop5.getCropArea();
        String cropSeason5 = crop5.getCropSeason();
        String cropType5 = crop5.getCropType();
        double cropYield5 = crop5.getCropYield();
        String cropRegion5 = crop5.getCropRegion();

        System.out.println("Crop ID: " + cropId1);
        System.out.println("Crop Name: " + cropName1);
        System.out.println("Crop Area: " + cropArea1 + " hectares");
        System.out.println("Crop Season: " + cropSeason1);
        System.out.println("Crop Type: " + cropType1);
        System.out.println("Crop Yield: " + cropYield1 + " tons");
        System.out.println("Crop Region: " + cropRegion1);
        System.out.println("------------------------------");

        System.out.println("Crop ID: " + cropId2);
        System.out.println("Crop Name: " + cropName2);
        System.out.println("Crop Area: " + cropArea2 + " hectares");
        System.out.println("Crop Season: " + cropSeason2);
        System.out.println("Crop Type: " + cropType2);
        System.out.println("Crop Yield: " + cropYield2 + " tons");
        System.out.println("Crop Region: " + cropRegion2);
        System.out.println("------------------------------");

        System.out.println("Crop ID: " + cropId3);
        System.out.println("Crop Name: " + cropName3);
        System.out.println("Crop Area: " + cropArea3 + " hectares");
        System.out.println("Crop Season: " + cropSeason3);
        System.out.println("Crop Type: " + cropType3);
        System.out.println("Crop Yield: " + cropYield3 + " tons");
        System.out.println("Crop Region: " + cropRegion3);
        System.out.println("------------------------------");

        System.out.println("Crop ID: " + cropId4);
        System.out.println("Crop Name: " + cropName4);
        System.out.println("Crop Area: " + cropArea4 + " hectares");
        System.out.println("Crop Season: " + cropSeason4);
        System.out.println("Crop Type: " + cropType4);
        System.out.println("Crop Yield: " + cropYield4 + " tons");
        System.out.println("Crop Region: " + cropRegion4);
        System.out.println("------------------------------");

        System.out.println("Crop ID: " + cropId5);
        System.out.println("Crop Name: " + cropName5);
        System.out.println("Crop Area: " + cropArea5 + " hectares");
        System.out.println("Crop Season: " + cropSeason5);
        System.out.println("Crop Type: " + cropType5);
        System.out.println("Crop Yield: " + cropYield5 + " tons");
        System.out.println("Crop Region: " + cropRegion5);
        System.out.println("------------------------------");
    }
}
