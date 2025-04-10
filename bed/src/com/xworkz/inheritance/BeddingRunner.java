package com.xworkz.inheritance;

import com.xworkz.inheritance.bedding.Bedding;
import com.xworkz.inheritance.blanket.Blanket;

public class BeddingRunner {
    public static void main(String[] args) {
        Bedding bedding = new Bedding();
        bedding.fold();
        bedding.use();

        Blanket blanket = new Blanket();
        blanket.fold();
        blanket.use();
    }
}
