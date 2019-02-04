package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> dataMap = new HashMap<>();
        dataMap.put("Frankfurt", true);
        dataMap.put("Warsaw", false);

        if( dataMap.containsKey(flight.getArrivalAirport()) && dataMap.get(flight.getArrivalAirport())){
            System.out.println(flight.getArrivalAirport() + " airport exists in our database and it is available to fly there.");
        }
        else if( dataMap.containsKey(flight.getArrivalAirport()) && !(dataMap.get(flight.getArrivalAirport()))){
            System.out.println("Sorry, for the moment there is no any flight to the destination you have asked.");
        }
        else{
            throw new RouteNotFoundException();
        }
    }
}
