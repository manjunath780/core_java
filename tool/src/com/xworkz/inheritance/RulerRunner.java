package com.xworkz.inheritance;

import com.xworkz.inheritance.ruler.Ruler;
import com.xworkz.inheritance.tool.Tool;

public class RulerRunner {
    public static void main(String[] args) {
        Tool tool = new Ruler();
        Ruler ruler = (Ruler) tool;
        System.out.println(tool);
    }
}
