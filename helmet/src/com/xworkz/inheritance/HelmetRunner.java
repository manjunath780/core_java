package com.xworkz.inheritance;

import com.xworkz.inheritance.helmet.Helmet;
import com.xworkz.inheritance.protection.Protection;

public class HelmetRunner {
    public static void main(String[] args) {
        Protection protection= new Helmet();
        Helmet helmet = (Helmet) protection;
        System.out.println(helmet);
    }
}
