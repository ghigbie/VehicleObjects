package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Vehicle {

    private String steering;
    private int currentGear;
    private int movingSpeedMax;
    private int movingSpeedOptimum;

    public Vehicle(String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum){
        this.steering = steering;
        this.currentGear = currentGear;
        this.movingSpeedMax = movingSpeedMax;
        this.movingSpeedOptimum = movingSpeedOptimum;
    }

    public void move(int movingSpeed){
        System.out.println("This vehicle is moving at " + movingSpeed + "mph.");
        if(movingSpeed >= 65){
            moveFast();
        }

    }

    public void changeDirection(String steeringDirection){
        steeringDirection = steeringDirection.toLowerCase();
        if(steeringDirection == "right" || steeringDirection == "left") {
            System.out.println("This vehicle is turning to " + steeringDirection + ".");
        }else{
            System.out.println("This vehicle is moving straight ahead.");
        }
    }

    public void moveFast(){
        System.out.println("This vehicle is moving fast!");
    }

}
