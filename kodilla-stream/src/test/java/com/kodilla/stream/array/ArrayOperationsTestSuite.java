package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
       //Given
       int[] exampleTable = {5, 8, 12, 34, 18};
       //When
       double result = ArrayOperations.getAverage(exampleTable);
       //Then
       Assert.assertEquals(15.40, result, 0.001);
   }
}
