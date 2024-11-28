package com.metrorider.data.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    String userId;
    String profilePicture;
    String name;
    String gender;
    String address;
    String phoneNumber;
    String email;
    int karma;
    int averageRating;
    boolean isVerified;
}
