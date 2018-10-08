package com.being.zero.design.patterns.question2;

import java.util.HashSet;
import java.util.Set;

public final class SpiceJet {

    public Set<String> allFlightTimings(){
        Set<String> set = new HashSet<String>();
        set.add("8.00");
        set.add("9.00");
        set.add("10.00");
        set.add("11.00");

        return set;
    }
}
