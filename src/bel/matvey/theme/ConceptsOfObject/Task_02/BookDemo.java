package bel.matvey.theme.ConceptsOfObject.Task_02;

import bel.matvey.theme.ConceptsOfObject.Task_02.entity.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Maks","Goblins",60);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Name: " + book.getName());
        System.out.println("Page: " + book.getPage());
    }
}

