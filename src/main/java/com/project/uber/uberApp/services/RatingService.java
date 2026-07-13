package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDto;
import com.project.uber.uberApp.dto.RiderDto;
import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.Ride;
import com.project.uber.uberApp.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
