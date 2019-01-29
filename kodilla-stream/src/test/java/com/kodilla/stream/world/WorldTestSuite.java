package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europa = new Continent();
        europa.addCountry(new Country("Polska", new BigDecimal("32745329")));
        europa.addCountry(new Country("Francja", new BigDecimal("75646321")));
        europa.addCountry(new Country("Hiszpania", new BigDecimal("63453829")));
        Continent azja = new Continent();
        azja.addCountry(new Country("Chiny", new BigDecimal("9876455768")));
        azja.addCountry(new Country("Indie", new BigDecimal("4536281971")));
        azja.addCountry(new Country("Japonia", new BigDecimal("657483")));
        Continent amerykaPoludniowa = new Continent();
        amerykaPoludniowa.addCountry(new Country("Brazylia", new BigDecimal("87765454")));
        amerykaPoludniowa.addCountry(new Country("Argentyna", new BigDecimal("95643765")));
        amerykaPoludniowa.addCountry(new Country("Wenezuela", new BigDecimal("7648771")));
        World world = new World();
        world.addContinent(europa);
        world.addContinent(azja);
        world.addContinent(amerykaPoludniowa);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expectedValue = new BigDecimal("14776298691");
        Assert.assertEquals(expectedValue, result);

    }
}
