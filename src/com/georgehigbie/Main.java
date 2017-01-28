package com.georgehigbie;

public class Main {

    public static void main(String[] args) {
	// write your code here

        manufactureCars();

    }

    public static void manufactureCars(){
        Car car1 = new Car("Power Steering", 1, 120, 55);
        car1.move(66);
        car1.changingGearsDown(1);

        Honda honda1 = new Honda("Power Steering", 2, 130, 55);
        honda1.move(77);
        honda1.changingGearsUp(2);
    }
}
