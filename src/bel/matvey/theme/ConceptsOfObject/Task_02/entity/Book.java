package bel.matvey.theme.ConceptsOfObject.Task_02.entity;

public class Book {
    String Author,Name;
    int Page;
    public Book(String author,String name, int page) {
        setAuthor(author);
        setName(name);
        setPage(page);
    }
    public void setAuthor(String author){this.Author = author;}
    public void setName(String name){this.Name = name;}
    public void setPage(int page){this.Page = page;}

    public String getAuthor(){return this.Author;}
    public String getName(){return this.Name;}
    public int getPage(){return this.Page;}

}
