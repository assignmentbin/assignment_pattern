package com.being.zero.design.patterns.questions3;

import com.being.zero.design.patterns.question3.Client;
import com.being.zero.design.patterns.question3.SimpleGun;
import org.junit.Assert;
import org.junit.Test;

public class TestClient {

    @Test
    public void testClientForLaser(){
        Client client = new Client();
        String result = client.gunWithLaser(new SimpleGun());
        Assert.assertEquals("fire laser", result);
    }

    @Test
    public void testClientForSilencer(){
        Client client = new Client();
        String result = client.gunWithSilencer(new SimpleGun());
        Assert.assertEquals("fire silencer", result);
    }


    @Test
    public void testClientForLaserAndSilencer(){
        Client client = new Client();
        String result = client.gunWithLaserAndSilencer(new SimpleGun());
        Assert.assertEquals("fire laser silencer", result);
    }

}
