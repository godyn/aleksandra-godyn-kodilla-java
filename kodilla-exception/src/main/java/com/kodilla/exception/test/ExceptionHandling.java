package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();


        try{
            String result = secondChallenge.probablyIWillThrowException(2,5);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Sorry, you have caused some error!");
        }
        finally {
            System.out.println("You are working on SecondChallenge.");
        }

    }
}
