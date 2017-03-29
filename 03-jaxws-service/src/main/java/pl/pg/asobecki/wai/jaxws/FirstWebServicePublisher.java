package pl.pg.asobecki.wai.jaxws;

import javax.xml.ws.Endpoint;

/**
 * Created by asobecki on 29.03.17.
 */
// Endpoint publisher
public class FirstWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/jax-ws/first-ws", new FirstWebServiceImpl());
    }
}
