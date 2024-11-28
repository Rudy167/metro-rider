package com.metrorider.data.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Matches {

    String userIdOne;
    String userIdTwo;
    String rideRequestId;
    Date timeOfMatch;
    boolean rideSuccess;
    int ratingUserOne;
    int ratingUserTwo;
    String commentUserOne;
    String commentUserTwo;
    
}
