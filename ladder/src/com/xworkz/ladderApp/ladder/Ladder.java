package com.xworkz.ladderApp.ladder;


public class Ladder {
    private int ladderId;
    private String ladderBrand;
    private String ladderMaterial;
    private double ladderHeight;
    private boolean isFoldable;

    // Getters and Setters
    public int getLadderId() {
        return ladderId;
    }

    public void setLadderId(int ladderId) {
        this.ladderId = ladderId;
    }

    public String getLadderBrand() {
        return ladderBrand;
    }

    public void setLadderBrand(String ladderBrand) {
        this.ladderBrand = ladderBrand;
    }

    public String getLadderMaterial() {
        return ladderMaterial;
    }

    public void setLadderMaterial(String ladderMaterial) {
        this.ladderMaterial = ladderMaterial;
    }

    public double getLadderHeight() {
        return ladderHeight;
    }

    public void setLadderHeight(double ladderHeight) {
        this.ladderHeight = ladderHeight;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public void setFoldable(boolean foldable) {
        isFoldable = foldable;
    }
}
