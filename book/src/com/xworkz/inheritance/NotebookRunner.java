package com.xworkz.inheritance;

import com.xworkz.inheritance.book.Book;
import com.xworkz.inheritance.notebook.Notebook;

public class NotebookRunner {
    public static void main(String[] args) {
        Book book = new Notebook();
        Notebook notebook = (Notebook) book;
        System.out.println(notebook);
    }
}
