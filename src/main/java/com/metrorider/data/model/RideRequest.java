package com.metrorider.data.model;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import com.metrorider.data.entity.*;

@Getter
@Setter
public class RideRequest {

    String rideRequestId;
    User user;
    String fromLocation;
    String toLocation;
    Date timeOfRequest;
    Transport modeOfTransport;
    int availableCapacity;
    Date validUntil;
    String comments;




}
