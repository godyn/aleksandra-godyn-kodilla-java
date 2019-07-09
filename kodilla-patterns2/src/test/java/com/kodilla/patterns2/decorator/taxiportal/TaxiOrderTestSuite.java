package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(40), calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testUberNetworkGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testUberNetworkGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course by Uber Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(29), calculatedCost);
    }

    @Test
    public void testUberWithTwoChildSeatGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();
        //THEN
        Assert.assertEquals(new BigDecimal(52), calculatedCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //GIVEN
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //WHEN
        String description = theOrder.getDescription();
        //THEN
        Assert.assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
