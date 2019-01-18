package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator object = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = object.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(result, emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator object = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>() ;
        normalList.add(5);
        normalList.add(13);
        normalList.add(2);
        normalList.add(8);
        normalList.add(544);
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(8);
        expectedList.add(544);
        //When
        ArrayList<Integer> result = object.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(result, expectedList);

    };
}
