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

    public Map<FlightNumber, FlightDirection> searchFlightFrom(String startPoint){
        return flightsDatabase.entrySet().stream()
                .filter(e -> e.getValue().getDepartureAirport().equals(startPoint))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    public Map<FlightNumber, FlightDirection> searchFlightTo(String endPoint){
        return flightsDatabase.entrySet().stream()
                .filter(e -> e.getValue().getLandingAirport().equals(endPoint))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    public void viewResult(Map<FlightNumber, FlightDirection> map){
         map.entrySet().stream()
                 .forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
    }

    public void searchIndirectFlight(String startPoint, String endPoint){

        Map<FlightNumber, FlightDirection> startMap = searchFlightFrom(startPoint);
        Map<FlightNumber, FlightDirection> endMap = searchFlightTo(endPoint);

        for(Map.Entry<FlightNumber, FlightDirection> entry: startMap.entrySet()){
            endMap.entrySet().stream()
                    .filter(e->e.getValue().getDepartureAirport().equals(entry.getValue().getLandingAirport()))
                    .forEach(e -> System.out.println(entry +" "+ e));
        }
    }
}
