package com.xworkz.inheritance;

import com.xworkz.inheritance.book.Book;
import com.xworkz.inheritance.notebook.Notebook;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();

        Notebook notebook = new Notebook();
        notebook.read();
    }
}
