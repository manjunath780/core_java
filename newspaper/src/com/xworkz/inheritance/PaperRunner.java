package com.xworkz.inheritance;

import com.xworkz.inheritance.paper.Paper;
import com.xworkz.inheritance.newspaper.Newspaper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.print();
        paper.fold();

        Newspaper newspaper = new Newspaper();
        newspaper.print();
        newspaper.fold();
    }
}
