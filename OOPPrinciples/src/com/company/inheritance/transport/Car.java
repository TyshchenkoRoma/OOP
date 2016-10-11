package com.company.inheritance.transport;


public class Car extends GroundTransport{
    public static final int CITY_LIMIT = 60;

    private int maxSpeed;
    private boolean inCity;

    public Car(int maxSpeed, boolean inCity) {
        this.maxSpeed = maxSpeed;
        this.inCity = inCity;
    }


    @Override
    public int speed() {
        return inCity ? CITY_LIMIT : maxSpeed;
    }
}
