package com.xworkz.inheritance;

import com.xworkz.inheritance.tool.Tool;
import com.xworkz.inheritance.ruler.Ruler;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.help();

        Ruler ruler = new Ruler();
        ruler.help();
    }
}
