package com.metrorider.controller;

import com.metrorider.data.dto.LoginRequest;
import com.metrorider.data.dto.ResetPasswordRequest;
import com.metrorider.data.dto.UpdatePasswordRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.metrorider.data.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hello Spring Boot Boilerplate");

    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        // TO DO: implement user registration logic here
        // for now, just return a success message
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // TO DO: implement login logic here
        // for now, just return a success message
        return ResponseEntity.ok("User logged in successfully");
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getProfile(@RequestHeader("Authorization") String token) {
        // TO DO: implement profile retrieval logic here
        // for now, just return a dummy user
        User user = new User();
        return ResponseEntity.ok(user);
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        // TO DO: implement password reset logic here
        // for now, just return a success message
        return ResponseEntity.ok("Password reset successfully");
    }

    @PutMapping("/update-password")
    public ResponseEntity<String> updatePassword(@RequestHeader("Authorization") String token, @RequestBody UpdatePasswordRequest updatePasswordRequest) {
        // TO DO: implement password update logic here
        // for now, just return a success message
        return ResponseEntity.ok("Password updated successfully");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader("Authorization") String token) {
        // TO DO: implement logout logic here
        // for now, just return a success message
        return ResponseEntity.ok("User logged out successfully");
    }



}
