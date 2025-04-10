package com.xworkz.inheritance;

import com.xworkz.inheritance.tool.Tool;
import com.xworkz.inheritance.knife.Knife;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.use();
        tool.repair();

        Knife knife = new Knife();
        knife.use();
        knife.repair();
    }
}
