package com.example.tg1;

import java.util.Date;

public class hotel {

    String location;
    int num_rooms;
    double cost_per_night;
    Date check_in;
    Date check_out;
    String reserve_name;

    public hotel(String location, int num_rooms, double cost_per_night, Date check_in, Date check_out, String reserve_name) {
        this.location = location;
        this.num_rooms = num_rooms;
        this.cost_per_night = cost_per_night;
        this.check_in = check_in;
        this.check_out = check_out;
        this.reserve_name = reserve_name;
    }

    public double getPricePerNight() {
        return this.cost_per_night;
    }
}
