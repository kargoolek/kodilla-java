package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();

        try {
            sc.probablyIWillThrowException(9, 0);
        } catch (Exception e) {
            System.out.println("Wystąpił błąd :/ \n"+e);
            e.printStackTrace();
        }
    }

}
