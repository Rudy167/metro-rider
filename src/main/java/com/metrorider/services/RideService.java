package com.metrorider.services;

import com.metrorider.data.entity.Matches;
import com.metrorider.data.model.RideRequest;

import java.util.List;

public class RideService {
    public List<RideRequest> searchRides(String pickupLocation, String dropLocation, String date, String time) {
        return List.of();
    }

    public RideRequest createRide(RideRequest ride) {
        return ride;
    }

    public void deleteRide(Long rideId) {
    }

    public RideRequest matchRide(String pickupLocation, String dropLocation, String date, String time) {
        return null;
    }

    public Matches postRideExperience(Long rideId, String experience, Integer rating) {
        return null;
    }
}
