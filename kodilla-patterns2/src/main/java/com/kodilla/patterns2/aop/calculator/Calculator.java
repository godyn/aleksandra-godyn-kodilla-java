package com.kodilla.patterns2.aop.calculator;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@EnableAspectJAutoProxy
@Component
public class Calculator {

    public double add(double x, double y){
        return x+y;
    }

    public double sub(double x, double y){
        return x-y;
    }
    public double mul(double x, double y){
        return x*y;
    }
    public double div(double x, double y){
        if(y==0){
            throw new ArithmeticException("Divide by zero!");
        }
        return x/y;
    }

    public BigDecimal factorial(int n){
        if(n>1){
            return factorial(n-1).multiply(new BigDecimal(n));
        }
        else if(n==0 || n==1){
            return new BigDecimal(1);
        }
        else{
            throw new ArithmeticException("Negative number cannot be applied to factorial");
        }
    }
}
