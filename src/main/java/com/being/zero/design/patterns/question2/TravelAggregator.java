package com.being.zero.design.patterns.question2;

import java.util.List;

public class TravelAggregator {

    private List<FlightSource> flightSources;

    public TravelAggregator(List<FlightSource> flightSources) {
        this.flightSources = flightSources;
    }

    public String getFlights(){
        StringBuilder builder = new StringBuilder();
        for(FlightSource source :  flightSources){
            builder.append(source.getName()).append(": ");
            for (String time:source.getFlightTimingDetails()){
                builder.append(time).append(", ");
            }
            builder.deleteCharAt(builder.length()-1);
            builder.deleteCharAt(builder.length()-1);
            builder.append(" ; ");
        }
        builder.deleteCharAt(builder.length()-1);
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }


}
