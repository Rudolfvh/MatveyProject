package bel.matvey.theme.ConceptsOfObject.Task_02.Test;

import bel.matvey.theme.ConceptsOfObject.Task_02.entity.Book;
import org.junit.Test;

public class BookTest {

    @Test
    public void equalsAuthorTrue() {
        Book bookOne = new Book("Maks","Dragon",25);
        Book bookTwo = new Book("Maks","Goblin",10);
        System.out.println(bookOne.getAuthor().equals(bookTwo.getAuthor()));
    }

    @Test
    public void equalsAuthorFalse() {
        Book bookOne = new Book("Matvey","Gnom",12);
        Book bookTwo = new Book("Maks","Goblin",10);
        System.out.println(bookOne.getAuthor().equals(bookTwo.getAuthor()));
    }

    @Test
    public void equalsNameTrue() {
        Book bookOne = new Book("Matvey","Goblin",12);
        Book bookTwo = new Book("Maks","Goblin",10);
        System.out.println(bookOne.getName().equals(bookTwo.getName()));
    }

    @Test
    public void equalsNameFalse() {
        Book bookOne = new Book("Matvey","Gnom",12);
        Book bookTwo = new Book("Maks","Goblin",10);
        System.out.println(bookOne.getName().equals(bookTwo.getName()));
    }

    @Test
    public void equalsPageTrue() {
        Book bookOne = new Book("Matvey","Gnom",12);
        Book bookTwo = new Book("Maks","Goblin",12);
        System.out.println(bookOne.getPage() == bookTwo.getPage());
    }

    @Test
    public void equalsPageFalse() {
        Book bookOne = new Book("Matvey","Gnom",12);
        Book bookTwo = new Book("Maks","Goblin",10);
        System.out.println(bookOne.getPage() == bookTwo.getPage());
    }
}