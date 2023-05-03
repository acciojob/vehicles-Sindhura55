package com.driver;

public  abstract class Boat implements WaterVehicle{
    String name;
    int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }




    public String getVehicleName(){
        return this.name;
    }

     public int getCapacity()
        {
        return this.capacity ;
    }

}
