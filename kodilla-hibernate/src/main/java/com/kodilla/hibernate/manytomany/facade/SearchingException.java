package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {

    public static String ERR = "Sorry, something went wrong. Searching failure.";

    public SearchingException(String message) {
        super(message);
    }
}
