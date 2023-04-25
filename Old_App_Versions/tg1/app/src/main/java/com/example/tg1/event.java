package com.example.tg1;

public class event {

    String location;
    double cost;

    public event(String location, double cost) {
        this.location = location;
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getDirections() {
        return this.location;
    }
}
