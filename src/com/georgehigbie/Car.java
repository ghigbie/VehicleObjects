package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Car extends Vehicle {

    public Car(String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum) {
        super(steering, currentGear, movingSpeedMax, movingSpeedOptimum);
    }



    @Override
    public void move(int movingSpeed) {
        System.out.println("This car is moving at " + movingSpeed + "mph.");
        super.move(movingSpeed);
    }




}
