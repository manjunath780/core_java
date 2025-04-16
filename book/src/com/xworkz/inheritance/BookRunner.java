package com.xworkz.inheritance;

import com.xworkz.inheritance.book.Book;
import com.xworkz.inheritance.notebook.Notebook;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.open();
        book.read();
        book.hasPages();
        book.hasCover();
        book.printedContent();

        Book bookRef = new Notebook();
        bookRef.open();
        bookRef.read();
        bookRef.hasPages();
        bookRef.hasCover();
        bookRef.printedContent();

        Notebook notebook = new Notebook();
        notebook.open();
        notebook.read();
        notebook.writeNotes();
        notebook.ruledPages();
        notebook.spiralBinding();
    }
}
