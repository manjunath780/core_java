package com.xworkz.markerApp.marker;



public class Marker {

    private int markerId;
    private String markerBrand;
    private String markerColor;
    private String markerType;
    private double markerPrice;
    private String markerInkType;
    private boolean isPermanent;

    public Marker() {
    }

    public int getMarkerId() {
        return markerId;
    }

    public void setMarkerId(int markerId) {
        this.markerId = markerId;
    }

    public String getMarkerBrand() {
        return markerBrand;
    }

    public void setMarkerBrand(String markerBrand) {
        this.markerBrand = markerBrand;
    }

    public String getMarkerColor() {
        return markerColor;
    }

    public void setMarkerColor(String markerColor) {
        this.markerColor = markerColor;
    }

    public String getMarkerType() {
        return markerType;
    }

    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }

    public double getMarkerPrice() {
        return markerPrice;
    }

    public void setMarkerPrice(double markerPrice) {
        this.markerPrice = markerPrice;
    }

    public String getMarkerInkType() {
        return markerInkType;
    }

    public void setMarkerInkType(String markerInkType) {
        this.markerInkType = markerInkType;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

}

