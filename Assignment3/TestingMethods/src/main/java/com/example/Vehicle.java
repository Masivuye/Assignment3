package com.example;

import java.util.Objects;
public class Vehicle{
private int numWheels;
private String color;
private String type;

private Vehicle(){}

public int getNumWheels() {
        return numWheels;
        }

public String getColor() {
        return color;
        }

public String getType() {
        return type;
        }

public Vehicle(Builder builder) {
        this.numWheels = builder.numWheels;
        this.color = builder.color;
        this.type = builder.type;
        }
public static class Builder{
    private int numWheels;
    private String color;
    private String type;

    public  Builder numWheels(int i){
        this.numWheels = i;
        return this;
    }
    public  Builder color(String i){
        this.color = i;
        return this;
    }
    public  Builder type(String i){
        this.type = i;
        return this;
    }
    public Vehicle build(){
        return new Vehicle(this);
    }

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getNumWheels(),vehicle.getNumWheels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumWheels());
    }
}
