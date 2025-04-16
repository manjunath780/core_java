package com.xworkz.inheritance.notebook;

import com.xworkz.inheritance.book.Book;

public class Notebook extends Book {
    public void writeNotes() {
        System.out.println("Notebook is used to write notes");
    }

    public void ruledPages() {
        System.out.println("Notebook usually has ruled pages");
    }

    public void spiralBinding() {
        System.out.println("Notebook can have spiral binding");
    }

    public void personalUse() {
        System.out.println("Notebook is often used for personal notes or study");
    }
}
