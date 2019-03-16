package com.kodilla.good.patterns.flights;

public final class FlightDirection {

    private final String departureAirport;
    private final String landingAirport;

    public FlightDirection(final String departureAirport, final String landingAirport) {
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getLandingAirport() {
        return landingAirport;
    }

    @Override
    public String toString(){
        return "\nDeparture Airport: " +departureAirport + "\nLanding Airport: " + landingAirport;
    }
}
