package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);


        /****************Exercise 7.3.****************/

        System.out.println("\n****************Exercise 7.3.****************\n");

        Forum forum = new Forum();
        Map<Integer, ForumUser> filteredUsers = forum.getUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> Period.between(u.getBirthDate(),LocalDate.now()).getYears() >= 20)
                .filter(u -> u.getPostsPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getID,u -> u));

        filteredUsers.entrySet().stream().forEach(System.out::println);
    }

}








/*
    W metodzie main(String[] args) klasy StreamMain napisz program, który:
        zainicjuje strumień Stream przy pomocy metody stream() kolekcji
        odfiltruje tylko tych użytkowników, którzy są mężczyznami
        odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
        odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
        przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
        wyświetli otrzymaną mapę wynikową*/
