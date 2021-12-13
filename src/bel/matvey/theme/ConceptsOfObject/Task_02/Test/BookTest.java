package bel.matvey.theme.ConceptsOfObject.Task_02.Test;

import bel.matvey.theme.ConceptsOfObject.Task_02.entity.Book;
import org.junit.Test;

public class BookTest {

    @Test
    public void equalsTrue() {
        Book bookOne = new Book("Maks","Goblin","25");
        Book bookTwo = new Book("Maks","Goblin","25");
        System.out.println(bookOne.equals(bookTwo));
    }

    @Test
    public void equalsFalse() {
        Book bookOne = new Book("Matvey","Gnom","12");
        Book bookTwo = new Book("Maks","Goblin","10");
        System.out.println(bookOne.equals(bookTwo));
    }
}