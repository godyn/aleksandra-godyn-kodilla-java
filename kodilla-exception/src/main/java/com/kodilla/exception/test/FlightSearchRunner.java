package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main (String[] args){
        Flight flight1 = new Flight("Paris", "Frankfurt");
        Flight flight2 = new Flight("Paris", "Las Vegas");
        Flight flight3 = new Flight("Paris", "Warsaw");

        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFlight(flight1);
            flightSearch.findFlight(flight3);
            flightSearch.findFlight(flight2);

        }
        catch(RouteNotFoundException e){
            System.out.println("Sorry, route not found!");

        }

    }
}
