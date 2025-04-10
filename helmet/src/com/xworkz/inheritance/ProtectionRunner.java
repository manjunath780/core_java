package com.xworkz.inheritance;

import com.xworkz.inheritance.protection.Protection;
import com.xworkz.inheritance.helmet.Helmet;

public class ProtectionRunner {
    public static void main(String[] args) {
        Protection protection = new Protection();
        protection.guard();
        protection.wear();

        Helmet helmet = new Helmet();
        helmet.guard();
        helmet.wear();
    }
}
