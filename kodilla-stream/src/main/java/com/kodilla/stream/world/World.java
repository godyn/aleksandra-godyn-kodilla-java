package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set <Continent> continents = new HashSet<>();

    public World() {
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    public void addContinent( Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){

        BigDecimal totalPeopleQuantity = getContinents().stream()
                .flatMap(continent -> continent.getListOfCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum= sum.add(current));

        return totalPeopleQuantity;
    }
}
