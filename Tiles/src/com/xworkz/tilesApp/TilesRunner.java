package com.xworkz.tilesApp;


import com.xworkz.tilesApp.tiles.Tiles;

public class TilesRunner {

    public static void main(String[] args) {
        System.out.println("TilesRunner main started");

        Tiles tile1 = new Tiles();
        tile1.setTileId(401);
        tile1.setTileBrand("Somany");
        tile1.setTileColor("Beige");
        tile1.setTileSize("12x12 inches");
        tile1.setTileMaterial("Ceramic");
        tile1.setTilePrice(450.00);
        tile1.setFloorTile(true);

        int tileId1 = tile1.getTileId();
        String tileBrand1 = tile1.getTileBrand();
        String tileColor1 = tile1.getTileColor();
        String tileSize1 = tile1.getTileSize();
        String tileMaterial1 = tile1.getTileMaterial();
        double tilePrice1 = tile1.getTilePrice();
        boolean isFloorTile1 = tile1.isFloorTile();

        Tiles tile2 = new Tiles();
        tile2.setTileId(402);
        tile2.setTileBrand("Kajaria");
        tile2.setTileColor("White");
        tile2.setTileSize("24x24 inches");
        tile2.setTileMaterial("Porcelain");
        tile2.setTilePrice(700.00);
        tile2.setFloorTile(false);

        int tileId2 = tile2.getTileId();
        String tileBrand2 = tile2.getTileBrand();
        String tileColor2 = tile2.getTileColor();
        String tileSize2 = tile2.getTileSize();
        String tileMaterial2 = tile2.getTileMaterial();
        double tilePrice2 = tile2.getTilePrice();
        boolean isFloorTile2 = tile2.isFloorTile();

        Tiles tile3 = new Tiles();
        tile3.setTileId(403);
        tile3.setTileBrand("HSIL");
        tile3.setTileColor("Grey");
        tile3.setTileSize("16x16 inches");
        tile3.setTileMaterial("Granite");
        tile3.setTilePrice(600.00);
        tile3.setFloorTile(true);

        int tileId3 = tile3.getTileId();
        String tileBrand3 = tile3.getTileBrand();
        String tileColor3 = tile3.getTileColor();
        String tileSize3 = tile3.getTileSize();
        String tileMaterial3 = tile3.getTileMaterial();
        double tilePrice3 = tile3.getTilePrice();
        boolean isFloorTile3 = tile3.isFloorTile();

        Tiles tile4 = new Tiles();
        tile4.setTileId(404);
        tile4.setTileBrand("NITCO");
        tile4.setTileColor("Black");
        tile4.setTileSize("18x18 inches");
        tile4.setTileMaterial("Marble");
        tile4.setTilePrice(1200.00);
        tile4.setFloorTile(true);

        int tileId4 = tile4.getTileId();
        String tileBrand4 = tile4.getTileBrand();
        String tileColor4 = tile4.getTileColor();
        String tileSize4 = tile4.getTileSize();
        String tileMaterial4 = tile4.getTileMaterial();
        double tilePrice4 = tile4.getTilePrice();
        boolean isFloorTile4 = tile4.isFloorTile();

        Tiles tile5 = new Tiles();
        tile5.setTileId(405);
        tile5.setTileBrand("Orient");
        tile5.setTileColor("Blue");
        tile5.setTileSize("12x12 inches");
        tile5.setTileMaterial("Vitrified");
        tile5.setTilePrice(350.00);
        tile5.setFloorTile(false);

        int tileId5 = tile5.getTileId();
        String tileBrand5 = tile5.getTileBrand();
        String tileColor5 = tile5.getTileColor();
        String tileSize5 = tile5.getTileSize();
        String tileMaterial5 = tile5.getTileMaterial();
        double tilePrice5 = tile5.getTilePrice();
        boolean isFloorTile5 = tile5.isFloorTile();


        System.out.println("Tile ID: " + tileId1);
        System.out.println("Tile Brand: " + tileBrand1);
        System.out.println("Tile Color: " + tileColor1);
        System.out.println("Tile Size: " + tileSize1);
        System.out.println("Tile Material: " + tileMaterial1);
        System.out.println("Tile Price: ₹" + tilePrice1);
        System.out.println("Is it a Floor Tile? " + (isFloorTile1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tile ID: " + tileId2);
        System.out.println("Tile Brand: " + tileBrand2);
        System.out.println("Tile Color: " + tileColor2);
        System.out.println("Tile Size: " + tileSize2);
        System.out.println("Tile Material: " + tileMaterial2);
        System.out.println("Tile Price: ₹" + tilePrice2);
        System.out.println("Is it a Floor Tile? " + (isFloorTile2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tile ID: " + tileId3);
        System.out.println("Tile Brand: " + tileBrand3);
        System.out.println("Tile Color: " + tileColor3);
        System.out.println("Tile Size: " + tileSize3);
        System.out.println("Tile Material: " + tileMaterial3);
        System.out.println("Tile Price: ₹" + tilePrice3);
        System.out.println("Is it a Floor Tile? " + (isFloorTile3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tile ID: " + tileId4);
        System.out.println("Tile Brand: " + tileBrand4);
        System.out.println("Tile Color: " + tileColor4);
        System.out.println("Tile Size: " + tileSize4);
        System.out.println("Tile Material: " + tileMaterial4);
        System.out.println("Tile Price: ₹" + tilePrice4);
        System.out.println("Is it a Floor Tile? " + (isFloorTile4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Tile ID: " + tileId5);
        System.out.println("Tile Brand: " + tileBrand5);
        System.out.println("Tile Color: " + tileColor5);
        System.out.println("Tile Size: " + tileSize5);
        System.out.println("Tile Material: " + tileMaterial5);
        System.out.println("Tile Price: ₹" + tilePrice5);
        System.out.println("Is it a Floor Tile? " + (isFloorTile5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
