package com.being.zero.design.patterns.question2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClient {

    @Test
    public void testOutput(){
        Client client = new Client();
        String result = client.getTimings(new Indigo(), new SpiceJet());

        Assert.assertEquals("Indigo: 7.30, 7.45, 08.00, 12.00 ; SpiceJet: 10.00, 11.00, 8.00, 9.00", result);
    }
}
