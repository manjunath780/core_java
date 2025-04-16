package com.xworkz.inheritance;

import com.xworkz.inheritance.chair.Chair;
import com.xworkz.inheritance.furniture.Furniture;

public class ChairRunner {
    public static void main(String[] args) {
        Furniture furniture  = new Chair();
        Chair  chair  = (Chair) furniture;
        System.out.println(chair);
    }
}
