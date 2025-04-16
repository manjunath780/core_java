package com.xworkz.inheritance;

import com.xworkz.inheritance.blanket.Blanket;
import com.xworkz.inheritance.bedding.Bedding;


public class BlanketRunner {
    public static void main(String[] args) {
        Bedding bedding = new Blanket();
        Blanket blanket = (Blanket) bedding;
        System.out.println(bedding);
    }
}
