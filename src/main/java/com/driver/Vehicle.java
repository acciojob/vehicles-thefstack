package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0; // Default speed is 0
        this.currentDirection = 0; // Default direction is 0 degrees
    }

    public void steer(int direction){
        this.currentDirection += direction; // Adjust the direction
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        this.currentSpeed = speed; // Set the speed
        this.currentDirection += direction;
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0; // Set speed to 0
        System.out.println("stop method called - The vehicle is stopped");
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

}
