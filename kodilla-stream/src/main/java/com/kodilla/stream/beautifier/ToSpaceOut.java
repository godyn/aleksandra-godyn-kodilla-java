package com.kodilla.stream.beautifier;

public class ToSpaceOut {

    public static String spaceOut(String text){

        String result= "";
        for(int i = 0; i< text.length(); i++){
            result = result + text.substring(i,i+1)+ " ";
        }

        return result;
    }
}
