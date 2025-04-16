package com.xworkz.inheritance;

import com.xworkz.inheritance.tool.Tool;
import com.xworkz.inheritance.ruler.Ruler;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.usedInWork();
        tool.madeOfMetalOrPlastic();
        tool.handheld();
        tool.comesInVariousSizes();
        tool.usefulInConstruction();

        Tool toolRef = new Ruler();
        toolRef.usedInWork();
        toolRef.madeOfMetalOrPlastic();
        toolRef.handheld();
        toolRef.comesInVariousSizes();
        toolRef.usefulInConstruction();

        Ruler ruler = new Ruler();
        ruler.usedInWork();
        ruler.handheld();
        ruler.usedForMeasuring();
        ruler.markedWithUnits();
        ruler.usedByStudents();

    }
}
