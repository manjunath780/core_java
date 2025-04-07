package com.xworkz.markerApp;

import com.xworkz.markerApp.marker.Marker;

public class MarkerRunner {

    public static void main(String[] args) {
        System.out.println("MarkerRunner main started");

        Marker marker1 = new Marker();
        marker1.setMarkerId(501);
        marker1.setMarkerBrand("Camlin");
        marker1.setMarkerColor("Red");
        marker1.setMarkerType("Felt-tip");
        marker1.setMarkerPrice(25.00);
        marker1.setMarkerInkType("Water-based");
        marker1.setPermanent(false);

        int markerId1 = marker1.getMarkerId();
        String markerBrand1 = marker1.getMarkerBrand();
        String markerColor1 = marker1.getMarkerColor();
        String markerType1 = marker1.getMarkerType();
        double markerPrice1 = marker1.getMarkerPrice();
        String markerInkType1 = marker1.getMarkerInkType();
        boolean isPermanent1 = marker1.isPermanent();

        Marker marker2 = new Marker();
        marker2.setMarkerId(502);
        marker2.setMarkerBrand("Luxor");
        marker2.setMarkerColor("Blue");
        marker2.setMarkerType("Whiteboard");
        marker2.setMarkerPrice(35.00);
        marker2.setMarkerInkType("Alcohol-based");
        marker2.setPermanent(true);

        int markerId2 = marker2.getMarkerId();
        String markerBrand2 = marker2.getMarkerBrand();
        String markerColor2 = marker2.getMarkerColor();
        String markerType2 = marker2.getMarkerType();
        double markerPrice2 = marker2.getMarkerPrice();
        String markerInkType2 = marker2.getMarkerInkType();
        boolean isPermanent2 = marker2.isPermanent();

        Marker marker3 = new Marker();
        marker3.setMarkerId(503);
        marker3.setMarkerBrand("Artline");
        marker3.setMarkerColor("Green");
        marker3.setMarkerType("Permanent");
        marker3.setMarkerPrice(40.00);
        marker3.setMarkerInkType("Oil-based");
        marker3.setPermanent(true);

        int markerId3 = marker3.getMarkerId();
        String markerBrand3 = marker3.getMarkerBrand();
        String markerColor3 = marker3.getMarkerColor();
        String markerType3 = marker3.getMarkerType();
        double markerPrice3 = marker3.getMarkerPrice();
        String markerInkType3 = marker3.getMarkerInkType();
        boolean isPermanent3 = marker3.isPermanent();

        Marker marker4 = new Marker();
        marker4.setMarkerId(504);
        marker4.setMarkerBrand("Reynolds");
        marker4.setMarkerColor("Black");
        marker4.setMarkerType("Gel");
        marker4.setMarkerPrice(15.00);
        marker4.setMarkerInkType("Gel-based");
        marker4.setPermanent(false);

        int markerId4 = marker4.getMarkerId();
        String markerBrand4 = marker4.getMarkerBrand();
        String markerColor4 = marker4.getMarkerColor();
        String markerType4 = marker4.getMarkerType();
        double markerPrice4 = marker4.getMarkerPrice();
        String markerInkType4 = marker4.getMarkerInkType();
        boolean isPermanent4 = marker4.isPermanent();

        Marker marker5 = new Marker();
        marker5.setMarkerId(505);
        marker5.setMarkerBrand("Pilot");
        marker5.setMarkerColor("Purple");
        marker5.setMarkerType("Highlighter");
        marker5.setMarkerPrice(20.00);
        marker5.setMarkerInkType("Water-based");
        marker5.setPermanent(false);

        int markerId5 = marker5.getMarkerId();
        String markerBrand5 = marker5.getMarkerBrand();
        String markerColor5 = marker5.getMarkerColor();
        String markerType5 = marker5.getMarkerType();
        double markerPrice5 = marker5.getMarkerPrice();
        String markerInkType5 = marker5.getMarkerInkType();
        boolean isPermanent5 = marker5.isPermanent();

        System.out.println("Marker ID: " + markerId1);
        System.out.println("Marker Brand: " + markerBrand1);
        System.out.println("Marker Color: " + markerColor1);
        System.out.println("Marker Type: " + markerType1);
        System.out.println("Marker Price: ₹" + markerPrice1);
        System.out.println("Marker Ink Type: " + markerInkType1);
        System.out.println("Is it Permanent? " + (isPermanent1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Marker ID: " + markerId2);
        System.out.println("Marker Brand: " + markerBrand2);
        System.out.println("Marker Color: " + markerColor2);
        System.out.println("Marker Type: " + markerType2);
        System.out.println("Marker Price: ₹" + markerPrice2);
        System.out.println("Marker Ink Type: " + markerInkType2);
        System.out.println("Is it Permanent? " + (isPermanent2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Marker ID: " + markerId3);
        System.out.println("Marker Brand: " + markerBrand3);
        System.out.println("Marker Color: " + markerColor3);
        System.out.println("Marker Type: " + markerType3);
        System.out.println("Marker Price: ₹" + markerPrice3);
        System.out.println("Marker Ink Type: " + markerInkType3);
        System.out.println("Is it Permanent? " + (isPermanent3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Marker ID: " + markerId4);
        System.out.println("Marker Brand: " + markerBrand4);
        System.out.println("Marker Color: " + markerColor4);
        System.out.println("Marker Type: " + markerType4);
        System.out.println("Marker Price: ₹" + markerPrice4);
        System.out.println("Marker Ink Type: " + markerInkType4);
        System.out.println("Is it Permanent? " + (isPermanent4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Marker ID: " + markerId5);
        System.out.println("Marker Brand: " + markerBrand5);
        System.out.println("Marker Color: " + markerColor5);
        System.out.println("Marker Type: " + markerType5);
        System.out.println("Marker Price: ₹" + markerPrice5);
        System.out.println("Marker Ink Type: " + markerInkType5);
        System.out.println("Is it Permanent? " + (isPermanent5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
