package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> lst = new ArrayList<>();

    public Forum() {
        lst.add(new ForumUser(1, "Daddy Pig", 'M', LocalDate.of(1987, 2, 14), 992));
        lst.add(new ForumUser(2, "Mummy Pig", 'F', LocalDate.of(1987, 2, 14), 992));
        lst.add(new ForumUser(3, "George Pig", 'M', LocalDate.of(2012, 2, 14), 9993));
        lst.add(new ForumUser(4, "Peppa Pig", 'F', LocalDate.of(2010, 2, 14), 9994));
        lst.add(new ForumUser(5, "Pedro Ponny", 'M', LocalDate.of(2010, 2, 14), 9995));
        lst.add(new ForumUser(6, "Madame Gazelle", 'F', LocalDate.of(1977, 2, 14), 9996));
        lst.add(new ForumUser(7, "Danny Dog", 'M', LocalDate.of(2010, 2, 14), 0));
        lst.add(new ForumUser(8, "Grandpa Pig", 'M', LocalDate.of(1960, 2, 14), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(lst);
    }
}
