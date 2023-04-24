package com.example.tg1;

import java.util.Date;

public class rental {

    String car_make;
    String car_model;
    double cost_per_day;
    String rental_loc;
    Date start_date;
    Date return_date;
    String renter_name;

    public rental(String car_make, String car_model, double cost_per_day,
                  String rental_loc, Date start_date, Date return_date, user user) {
        this.car_make = car_make;
        this.car_model = car_model;
        this.cost_per_day = cost_per_day;
        this.rental_loc = rental_loc;
        this.start_date = start_date;
        this.return_date = return_date;
        this.renter_name = user.getName(user);
    }

    public double getPricePerDay() {
        return this.cost_per_day;
    }
}
