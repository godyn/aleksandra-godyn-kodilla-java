package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //GIVEN
        Book book1 = new Book("Quo vadis", "Sienkiewicz", LocalDate.of(2015, 1, 17));
        Book book2 = new Book("Morfina", "Twardoch", LocalDate.of(2017, 4, 15));
        Book book3 = new Book("XYZ", "ABC", LocalDate.of(2001, 6, 22));
        Library library = new Library("My library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try{
            clonedLibrary=library.shallowCopy();
            clonedLibrary.setName("My second library");
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My third library");
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        //WHEN
        library.getBooks().remove(book3);

        //THEN
        System.out.println(library.getBooks());
        Assert.assertEquals(2, library.getBooks().size());
        System.out.println(clonedLibrary.getBooks());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
