package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy(String name) throws CloneNotSupportedException {
        Library clone = (Library)super.clone();
        clone.setName(name);
        return clone;
    }

    public Library deepCopy(String name) throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.setName(name);
        clonedLibrary.books = new HashSet<>();
        for(Book book : getBooks()) {
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }
}