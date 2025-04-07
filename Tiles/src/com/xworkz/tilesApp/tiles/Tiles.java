package com.xworkz.tilesApp.tiles;


public class Tiles {
    private int tileId;
    private String tileBrand;
    private String tileColor;
    private String tileSize;
    private String tileMaterial;
    private double tilePrice;
    private boolean isFloorTile;

    public int getTileId() {
        return tileId;
    }

    public void setTileId(int tileId) {
        this.tileId = tileId;
    }

    public String getTileBrand() {
        return tileBrand;
    }

    public void setTileBrand(String tileBrand) {
        this.tileBrand = tileBrand;
    }

    public String getTileColor() {
        return tileColor;
    }

    public void setTileColor(String tileColor) {
        this.tileColor = tileColor;
    }

    public String getTileSize() {
        return tileSize;
    }

    public void setTileSize(String tileSize) {
        this.tileSize = tileSize;
    }

    public String getTileMaterial() {
        return tileMaterial;
    }

    public void setTileMaterial(String tileMaterial) {
        this.tileMaterial = tileMaterial;
    }

    public double getTilePrice() {
        return tilePrice;
    }

    public void setTilePrice(double tilePrice) {
        this.tilePrice = tilePrice;
    }

    public boolean isFloorTile() {
        return isFloorTile;
    }

    public void setFloorTile(boolean floorTile) {
        isFloorTile = floorTile;
    }
}
