package com.example.airline_api.controllers;

import com.example.airline_api.models.Booking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bookings")
public class BookingController {

    // TODO: Display all bookings
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings(){
        return null;
    }

    // TODO: Add details of a new booking
    @PostMapping(value = "/{id}")
    public ResponseEntity<Booking> addNewBooking(){
        return null;
    }

    // TODO: Extension - Update passenger meal preference
    @PatchMapping
    public ResponseEntity<Booking> updateMealPreference(){
        return null;
    }

}
