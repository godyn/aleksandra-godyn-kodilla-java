package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public final class FlightsService {

    private final HashMap<FlightNumber, FlightDirection> flightsDatabase = new HashMap<>();

    public FlightsService() {
        flightsDatabase.put(new FlightNumber(1),new FlightDirection("GDAŃSK", "KRAKÓW"));
        flightsDatabase.put(new FlightNumber(2),new FlightDirection("GDAŃSK", "WARSZAWA"));
        flightsDatabase.put(new FlightNumber(3),new FlightDirection("KRAKÓW", "WROCŁAW"));
        flightsDatabase.put(new FlightNumber(4),new FlightDirection("KRAKÓW", "RZESZÓW"));
        flightsDatabase.put(new FlightNumber(5),new FlightDirection("WARSZAWA", "GDAŃSK"));
        flightsDatabase.put(new FlightNumber(6),new FlightDirection("WARSZAWA", "KRAKÓW"));
        flightsDatabase.put(new FlightNumber(7),new FlightDirection("GDAŃSK", "WROCŁAW"));
        flightsDatabase.put(new FlightNumber(8),new FlightDirection("WROCŁAW", "GDAŃSK"));
        flightsDatabase.put(new FlightNumber(9),new FlightDirection("WROCŁAW", "FRANKFURT"));
    }


    /*
    public HashMap<FlightNumber, FlightDirection> searchFlightFrom2(String startPoint){

               return flightsDatabase.entrySet().stream()
                .filter(e->e.getValue().getDepartureAirport().equals(startPoint))
                .collect(Collectors.toConcurrentMap(e -> e.getKey(), e -> e.getValue()));
    }
    */




    public void searchFlightFrom(String startPoint){
        flightsDatabase.entrySet().stream()
                .filter(e->e.getValue().getDepartureAirport().equals(startPoint))
                .forEach(System.out::println);

    }

    public void searchFlightTo(String endPoint){
        flightsDatabase.entrySet().stream()
                .filter(e->e.getValue().getLandingAirport().equals(endPoint))
                .forEach(System.out::println);

    }

    public void searchIndirectFlight(String startPoint, String endPoint){

        HashMap<FlightNumber, FlightDirection> startMap = new HashMap<>();
        HashMap<FlightNumber, FlightDirection> endMap = new HashMap<>();

        for(Map.Entry<FlightNumber, FlightDirection> entry: flightsDatabase.entrySet()){
            if(entry.getValue().getDepartureAirport().equals(startPoint)){
                startMap.put(entry.getKey(), entry.getValue());
            }
        }
        for(Map.Entry<FlightNumber, FlightDirection> entry: flightsDatabase.entrySet()){
            if(entry.getValue().getLandingAirport().equals(endPoint)){
                endMap.put(entry.getKey(), entry.getValue());
            }
        }

        for(Map.Entry<FlightNumber, FlightDirection> entry: startMap.entrySet()){
            endMap.entrySet().stream()
                    .filter(e->e.getValue().getDepartureAirport().equals(entry.getValue().getLandingAirport()))
                    //.collect(Collectors.toConcurrentMap(e -> e.getKey(), e -> e.getValue()));
                    .forEach(e -> System.out.println(entry +" "+ e));
        }
    }

    public void searchDirectFlight(String startPoint, String endPoint){

    }
}
