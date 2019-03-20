package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //WHEN
        double addResult = calculator.add(2,6.5);
        double subResult = calculator.sub(10,3);
        double mulResult = calculator.mul(9,9);
        double divResult = calculator.div(100, 4);
        //THEN
        Assert.assertEquals(8.5, addResult, 0.001);
        Assert.assertEquals(7, subResult, 0.001);
        Assert.assertEquals(81, mulResult, 0.001);
        Assert.assertEquals(25, divResult, 0.001);
    }

}
