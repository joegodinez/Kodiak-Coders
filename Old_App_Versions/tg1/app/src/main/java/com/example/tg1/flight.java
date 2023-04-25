package com.example.tg1;

import java.sql.Time;
import java.util.Date;

public class flight {

    String departure_loc;
    Date departure_date;
    Time departure_time;
    String destination_loc;
    Date arrival_date;
    Time arrival_time;
    double cost;
    int user_id;

    public flight(String departure_loc, Date departure_date, Time departure_time,
                  String destination_loc, Date arrival_date, Time arrival_time, double cost, int user_id) {
        this.departure_loc = departure_loc;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.destination_loc = destination_loc;
        this.arrival_time = arrival_time;
        this.cost = cost;
        this.user_id = user_id;
    }

    public double getPrice() {
        return this.cost;
    }

    public Time calcFlightTime() {
        return this.departure_time;
    }
}
