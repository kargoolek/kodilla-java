package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
        public static String ERR_NOTHING_FOUND = "Found no matching results. Change your query.";

        public SearchException(String message) {
            super(message);
        }
}
