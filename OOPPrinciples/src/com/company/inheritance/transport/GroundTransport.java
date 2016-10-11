package com.company.inheritance.transport;


public abstract class GroundTransport implements Transport {
    @Override
    public void move() {
        System.out.println("we are moving by ground");
    }
}
