package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Honda extends Car {

    public Honda(String name, String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum) {
        super(name, steering, currentGear, movingSpeedMax, movingSpeedOptimum);
    }

    @Override
    public void move(int movingSpeed) {
        System.out.println("This Honda is moving at " +movingSpeed + "mph.");
        super.move(movingSpeed);
    }

    @Override
    public void changeDirection(String steeringDirection) {
        super.changeDirection(steeringDirection);
    }

    @Override
    public void moveFast() {
        System.out.println("This Honda is moving fast!");
    }
}
