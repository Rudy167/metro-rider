package com.metrorider.data.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport {

    User owner;

    //2 wheeler or 4 wheeler
    String type;

    int capacity;

    String registrationNumber;

    String vehicleColor;

    String otherDetails;
}
