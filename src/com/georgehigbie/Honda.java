package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Honda extends Car {

    public Honda(String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum) {
        super(steering, currentGear, movingSpeedMax, movingSpeedOptimum);
    }

    @Override
    public void move(int movingSpeed) {
        super.move(movingSpeed);
    }
}
