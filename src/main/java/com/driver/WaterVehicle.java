package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat implements WaterVehicle{
    String name;
    int capacity;
    public Boat(String name,int capacity)
    {
        this.name=name;
        this.capacity=capacity;
    }
    public String getVehicleName()
    {
        return this.name;
    }
    public int getVehicleCapacity()
    {
        return this.capacity;
    }
}