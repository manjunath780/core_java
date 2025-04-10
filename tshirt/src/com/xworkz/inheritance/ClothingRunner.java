package com.xworkz.inheritance;

import com.xworkz.inheritance.clothing.Clothing;
import com.xworkz.inheritance.tshirt.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.wear();
        clothing.wash();

        TShirt tshirt = new TShirt();
        tshirt.wear();
        tshirt.wash();
    }
}

