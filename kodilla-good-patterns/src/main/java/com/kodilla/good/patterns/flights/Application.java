package com.kodilla.good.patterns.flights;

import java.util.Map;

public class Application {

    public static void main(String[] args){

        FlightsService flightRequest = new FlightsService();

        Map<FlightNumber, FlightDirection> firstRequest;
        firstRequest = flightRequest.searchFlightFrom("GDAŃSK");
        flightRequest.viewResult(firstRequest);

        Map<FlightNumber, FlightDirection> secondRequest;
        secondRequest = flightRequest.searchFlightTo("FRANKFURT");
        flightRequest.viewResult(secondRequest);


        flightRequest.searchIndirectFlight("GDAŃSK", "RZESZÓW");

    }
}
