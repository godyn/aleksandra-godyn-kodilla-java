package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args){

        FlightsService flightRequest = new FlightsService();

        flightRequest.searchFlightFrom("GDAŃSK");
        flightRequest.searchFlightTo("FRANKFURT");
        flightRequest.searchIndirectFlight("GDAŃSK", "RZESZÓW");

    }
}
