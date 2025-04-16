package com.xworkz.inheritance;

import com.xworkz.inheritance.knife.Knife;
import com.xworkz.inheritance.tool.Tool;

public class KnifeRunner {
    public static void main(String[] args) {
        Tool tool = new Knife();
        Knife knife = (Knife) tool;
        System.out.println(knife);
    }
}
