package com.xworkz.ladderApp;

import com.xworkz.ladderApp.ladder.Ladder;

public class LadderRunner {

    public static void main(String[] args) {
        System.out.println("LadderRunner main started");

        Ladder ladder1 = new Ladder();
        ladder1.setLadderId(201);
        ladder1.setLadderBrand("Karcher");
        ladder1.setLadderMaterial("Aluminum");
        ladder1.setLadderHeight(6.5);
        ladder1.setFoldable(true);

        int ladderId1 = ladder1.getLadderId();
        String ladderBrand1 = ladder1.getLadderBrand();
        String ladderMaterial1 = ladder1.getLadderMaterial();
        double ladderHeight1 = ladder1.getLadderHeight();
        boolean isFoldable1 = ladder1.isFoldable();

        Ladder ladder2 = new Ladder();
        ladder2.setLadderId(202);
        ladder2.setLadderBrand("Werner");
        ladder2.setLadderMaterial("Fiberglass");
        ladder2.setLadderHeight(8.0);
        ladder2.setFoldable(false);

        int ladderId2 = ladder2.getLadderId();
        String ladderBrand2 = ladder2.getLadderBrand();
        String ladderMaterial2 = ladder2.getLadderMaterial();
        double ladderHeight2 = ladder2.getLadderHeight();
        boolean isFoldable2 = ladder2.isFoldable();

        Ladder ladder3 = new Ladder();
        ladder3.setLadderId(203);
        ladder3.setLadderBrand("Little Giant");
        ladder3.setLadderMaterial("Aluminum");
        ladder3.setLadderHeight(10.0);
        ladder3.setFoldable(true);

        int ladderId3 = ladder3.getLadderId();
        String ladderBrand3 = ladder3.getLadderBrand();
        String ladderMaterial3 = ladder3.getLadderMaterial();
        double ladderHeight3 = ladder3.getLadderHeight();
        boolean isFoldable3 = ladder3.isFoldable();

        Ladder ladder4 = new Ladder();
        ladder4.setLadderId(204);
        ladder4.setLadderBrand("Louisville Ladder");
        ladder4.setLadderMaterial("Steel");
        ladder4.setLadderHeight(12.0);
        ladder4.setFoldable(false);

        int ladderId4 = ladder4.getLadderId();
        String ladderBrand4 = ladder4.getLadderBrand();
        String ladderMaterial4 = ladder4.getLadderMaterial();
        double ladderHeight4 = ladder4.getLadderHeight();
        boolean isFoldable4 = ladder4.isFoldable();

        Ladder ladder5 = new Ladder();
        ladder5.setLadderId(205);
        ladder5.setLadderBrand("Hailo");
        ladder5.setLadderMaterial("Aluminum");
        ladder5.setLadderHeight(15.0);
        ladder5.setFoldable(true);

        int ladderId5 = ladder5.getLadderId();
        String ladderBrand5 = ladder5.getLadderBrand();
        String ladderMaterial5 = ladder5.getLadderMaterial();
        double ladderHeight5 = ladder5.getLadderHeight();
        boolean isFoldable5 = ladder5.isFoldable();

        // Print details for each ladder
        System.out.println("Ladder ID: " + ladderId1);
        System.out.println("Ladder Brand: " + ladderBrand1);
        System.out.println("Ladder Material: " + ladderMaterial1);
        System.out.println("Ladder Height: " + ladderHeight1 + " meters");
        System.out.println("Is it Foldable? " + (isFoldable1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Ladder ID: " + ladderId2);
        System.out.println("Ladder Brand: " + ladderBrand2);
        System.out.println("Ladder Material: " + ladderMaterial2);
        System.out.println("Ladder Height: " + ladderHeight2 + " meters");
        System.out.println("Is it Foldable? " + (isFoldable2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Ladder ID: " + ladderId3);
        System.out.println("Ladder Brand: " + ladderBrand3);
        System.out.println("Ladder Material: " + ladderMaterial3);
        System.out.println("Ladder Height: " + ladderHeight3 + " meters");
        System.out.println("Is it Foldable? " + (isFoldable3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Ladder ID: " + ladderId4);
        System.out.println("Ladder Brand: " + ladderBrand4);
        System.out.println("Ladder Material: " + ladderMaterial4);
        System.out.println("Ladder Height: " + ladderHeight4 + " meters");
        System.out.println("Is it Foldable? " + (isFoldable4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Ladder ID: " + ladderId5);
        System.out.println("Ladder Brand: " + ladderBrand5);
        System.out.println("Ladder Material: " + ladderMaterial5);
        System.out.println("Ladder Height: " + ladderHeight5 + " meters");
        System.out.println("Is it Foldable? " + (isFoldable5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}

