package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int avaragePublicationYear(final Map<BookSignature, Book> books) {
        Statistics stats = new Statistics();
        return stats.avaragePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(final Map<BookSignature, Book> books) {
        Statistics stats = new Statistics();
        return stats.medianPublicationYear(books);
    }
}
