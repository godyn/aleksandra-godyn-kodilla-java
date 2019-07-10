package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    Set<Book> oldSetOfBooks;

    @Test
    public void testMedianAdapter(){
        //GIVEN
        oldSetOfBooks = new HashSet<>();
        Book oldBook1 = new Book("A", "B", 2002, "C");
        Book oldBook2 = new Book("A", "B", 1988, "C");
        Book oldBook3 = new Book("A", "B", 2012, "C");
        oldSetOfBooks.add(oldBook1);
        oldSetOfBooks.add(oldBook2);
        oldSetOfBooks.add(oldBook3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //WHEN
        int calculatedMedian = medianAdapter.publicationYearMediana(oldSetOfBooks);
        //THEN
        Assert.assertEquals(2002, calculatedMedian);
    }
}
