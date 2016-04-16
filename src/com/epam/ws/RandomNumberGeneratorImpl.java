package com.epam.ws;

import javax.jws.WebService;
import java.util.Random;

/**
 * Created by Almas_Doskozhin
 * on 4/10/2016.
 */
@WebService(endpointInterface = "com.epam.ws.RandomNumberGenerator")
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {
    @Override
    public int randomNumber(int lowerBound, int upperBound) {
        Random r = new Random();
        return r.nextInt(upperBound-lowerBound) + lowerBound;
    }
}


