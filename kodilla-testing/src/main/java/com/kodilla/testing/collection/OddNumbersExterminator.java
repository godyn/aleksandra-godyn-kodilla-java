package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    public OddNumbersExterminator(){
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for( Integer value: numbers){
            if ( value % 2 == 0){
                evenNumbers.add(value);
            }
        }
        return evenNumbers;
    }
}
