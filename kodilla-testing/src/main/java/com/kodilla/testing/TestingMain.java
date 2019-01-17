package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();
        int result1 = calc.add(5,6);
        int result2 = calc.subtract(17,2);

        if (result1 == 11){
            System.out.println("Adding in Calculator works.");
        } else{
            System.out.println("Adding in Calculator - Error!");
        }
        if (result2 == 15){
            System.out.println("Substract in Calculator works.");
        } else{
            System.out.println("Substract in Calculator - Error!");
        }

    }
}