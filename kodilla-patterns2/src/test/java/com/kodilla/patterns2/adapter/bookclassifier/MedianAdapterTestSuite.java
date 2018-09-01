package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 1990,"00001"));
        bookSet.add(new Book("Author1", "Title1", 1990,"00002"));
        bookSet.add(new Book("Author1", "Title1", 1990,"00003"));
        bookSet.add(new Book("Author1", "Title1", 1994,"00004"));
        bookSet.add(new Book("Author1", "Title1", 1995,"00005"));

        //When
        int medianOfYear = adapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(1990, medianOfYear);
    }

}
