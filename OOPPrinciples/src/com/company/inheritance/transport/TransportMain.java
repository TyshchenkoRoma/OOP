package com.company.inheritance.transport;


public class TransportMain {
    public static void main(String[] args) {
        Transport transport = new Car(150 , false);
        transport.move();
        System.out.println("speed = " + transport.speed());
        transport = new UBoat(true);
        transport.move();
        System.out.println("speed = " + transport.speed());
        ((UBoat)transport).setUnderWater(false);
        transport.move();
        System.out.println("speed = " + transport.speed());

    }
}
