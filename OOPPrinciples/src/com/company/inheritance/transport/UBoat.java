package com.company.inheritance.transport;


public class UBoat extends WaterTransport {
    private boolean underWater;

    public UBoat(boolean underWater) {
        this.underWater = underWater;
    }

    @Override
    public void move() {
        super.move();
        if( underWater ){
            System.out.println("under water");
        }else{
            System.out.println("by water");
        }
    }

    @Override
    public int speed() {
        if( underWater ) {
            return 18;
        }else{
            return 36;
        }
    }

    public boolean isUnderWater() {
        return underWater;
    }

    public void setUnderWater(boolean underWater) {
        this.underWater = underWater;
    }
}
