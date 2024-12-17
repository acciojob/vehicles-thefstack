package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 6, isManual, "F1", 1); // Use default values for wheels, doors, etc.

    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    @Override
    public boolean isManual() {
        // TODO Auto-generated method stub
        return super.isManual();
    }

    @Override
    public int getCurrentGear() {
        // TODO Auto-generated method stub
        return super.getCurrentGear();
    }
    

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; // Calculate new speed

        if (newSpeed <= 0) {
            stop(); // Stop the car if speed is 0 or negative
            changeGear(1); // Set gear to 1 when stopped
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection()); // Adjust speed and keep direction
        }
    }
}
