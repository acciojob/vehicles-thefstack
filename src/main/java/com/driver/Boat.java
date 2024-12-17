package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    @Override
    public String getVehicleName() {
        // TODO Auto-generated method stub

        return name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public int getVehicleCapacity() {
        // TODO Auto-generated method stub
        return capacity;
    }
}
