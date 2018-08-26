package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        String originalName = "Biblioteka miejska nr 1";
        Library library = new Library(originalName);
        Library shallowCopyOfLibrary = null;
        Library deepCopyOfLibrary = null;
        String shallowCopyName = "Shallow copy of: "+library.getName();
        String deepCopyName = "Deep copy of: "+library.getName();

        final int booksQuantity = 20;
        IntStream.iterate(1, n -> n++)
                .limit(booksQuantity)
                .forEach(n -> library.getBooks().add(new Book("Book "+n, "Author "+n, LocalDate.of(2016, Month.AUGUST, 1+n))));

        try {
            shallowCopyOfLibrary = library.shallowCopy(shallowCopyName);
            deepCopyOfLibrary = library.deepCopy(deepCopyName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Book exampleBook = new Book("Book to remove", "Author ", LocalDate.of(2016, Month.AUGUST, 1));


        //When
        shallowCopyOfLibrary.getBooks().add(exampleBook);

        System.out.println(library.getBooks().size());
        System.out.println(shallowCopyOfLibrary.getBooks().size());
        System.out.println(deepCopyOfLibrary.getBooks().size());

        //Then
        Assert.assertEquals(originalName, library.getName());
        Assert.assertEquals(shallowCopyName, shallowCopyOfLibrary.getName());
        Assert.assertEquals(deepCopyName, deepCopyOfLibrary.getName());
        Assert.assertEquals(booksQuantity + 1, library.getBooks().size());
        Assert.assertEquals(booksQuantity + 1, shallowCopyOfLibrary.getBooks().size());
        Assert.assertEquals(booksQuantity, deepCopyOfLibrary.getBooks().size());
    }

}
