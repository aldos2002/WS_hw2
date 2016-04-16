package com.epam.endpoint;

import javax.xml.ws.Endpoint;

import com.epam.ws.RandomNumberGeneratorImpl;

/**
 * Created by Almas_Doskozhin
 * on 4/10/2016.
 */
public class RandomServicePublisher {

        public static void main(String[] args) {
            Endpoint.publish("http://localhost:9996/ws/random", new RandomNumberGeneratorImpl());

    }

}
