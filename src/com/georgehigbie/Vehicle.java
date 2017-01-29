package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Vehicle {
    private String name;
    private String steering;
    private int currentGear;
    private int movingSpeedMax;
    private int movingSpeedOptimum;

    public Vehicle(String name, String steering, int currentGear, int movingSpeedMax, int movingSpeedOptimum){
        this.name = name;
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

    public void changingGearsUp(int change){
        int changeGears = getCurrentGear() + change;
        System.out.println("You just up shifted from gear " + getCurrentGear() + " to " +changeGears + ".");
    }

    public void changingGearsDown(int change){
        int changeGears = getCurrentGear() - change;
        System.out.println("You just down shifted from gear " + getCurrentGear() + " to " +changeGears + ".");
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMovingSpeedMax() {
        return movingSpeedMax;
    }

    public void setMovingSpeedMax(int movingSpeedMax) {
        this.movingSpeedMax = movingSpeedMax;
    }

    public int getMovingSpeedOptimum() {
        return movingSpeedOptimum;
    }

    public void setMovingSpeedOptimum(int movingSpeedOptimum) {
        this.movingSpeedOptimum = movingSpeedOptimum;
    }
}
