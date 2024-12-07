package com.metrorider.controller;

import com.metrorider.data.entity.Matches;
import com.metrorider.data.model.RideRequest;
import com.metrorider.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideController {
    @Autowired
    private RideService rideService;


    @GetMapping("/search")
    public ResponseEntity<List<RideRequest>> searchRides(
            @RequestParam(required = false) String pickupLocation,
            @RequestParam(required = false) String dropLocation,
            @RequestParam(required = false) String date,
            @RequestParam(required = false) String time) {

        List<RideRequest> rides = rideService.searchRides(pickupLocation, dropLocation, date, time);

        return ResponseEntity.ok(rides);
    }

    @PostMapping
    public ResponseEntity<RideRequest> createRide(@RequestBody RideRequest ride) {
        RideRequest createdRide = rideService.createRide(ride);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRide);
    }

    @DeleteMapping("/{rideId}")
    public ResponseEntity<Void> deleteRide(@PathVariable Long rideId) {
        rideService.deleteRide(rideId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/match")
    public ResponseEntity<RideRequest> matchRide(
            @RequestParam String pickupLocation,
            @RequestParam String dropLocation,
            @RequestParam String date,
            @RequestParam String time) {

        RideRequest matchedRide = rideService.matchRide(pickupLocation, dropLocation, date, time);

        if (matchedRide == null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(matchedRide);
    }

    @PostMapping("/experience")
    public ResponseEntity<Matches> postRideExperience(
            @RequestParam Long rideId,
            @RequestParam String experience,
            @RequestParam Integer rating) {

        Matches match = rideService.postRideExperience(rideId, experience, rating);

        return ResponseEntity.status(HttpStatus.CREATED).body(match);
    }


}
