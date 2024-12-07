package com.metrorider.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePasswordRequest {

    private String currentPassword;
    private String newPassword;
    private String confirmPassword;

}
