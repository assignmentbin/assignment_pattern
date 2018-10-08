package com.being.zero.design.patterns.question2;

public class Client {

    public String getTimings(Indigo indigo, SpiceJet spiceJet){
        //TODO
        TravelAggregator travelAggregator = new TravelAggregator(null);
        return travelAggregator.getFlights();
    }

}
