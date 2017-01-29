package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Car extends Vehicle {
    private String make;
    private String model;

    public Car(String name, String make, String model, String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum) {
        super("car", steering, currentGear, movingSpeedMax, movingSpeedOptimum);
        this.make = make;
        this.model = model;
    }



    @Override
    public void move(int movingSpeed) {
        System.out.println("This car is moving at " + movingSpeed + "mph.");
        super.move(movingSpeed);
    }

    @Override
    public void changeDirection(String steeringDirection) {
        super.changeDirection(steeringDirection);
    }

    @Override
    public void moveFast() {
        super.moveFast();
    }

}
