package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //GIVEN
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                        .bun("withSezam")
                        .burgers(2)
                        .sauce("standard")
                        .ingredients("onion")
                        .ingredients("chilliPapers")
                        .ingredients("cheese")
                        .build();
        System.out.println(bigmac);
        //WHEN
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);

    }

}
