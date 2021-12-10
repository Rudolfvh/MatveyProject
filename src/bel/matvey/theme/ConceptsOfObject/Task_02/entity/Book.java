package bel.matvey.theme.ConceptsOfObject.Task_02.entity;

import java.util.Objects;

public class Book {
    String Author,Name,Page;
    public Book(String author,String name, String page) {
        setAuthor(author);
        setName(name);
        setPage(page);
    }
    public void setAuthor(String author){this.Author = author;}
    public void setName(String name){this.Name = name;}
    public void setPage(String page){this.Page = page;}

    public String getAuthor(){return this.Author;}
    public String getName(){return this.Name;}
    public String getPage(){return this.Page;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Page == book.Page && Objects.equals(Author, book.Author) && Objects.equals(Name, book.Name);
    }

    @Override
    public String toString(){
        return Author + " " + Name + " " + Page;
    }
}
