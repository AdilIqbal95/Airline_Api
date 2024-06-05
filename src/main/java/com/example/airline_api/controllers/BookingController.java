package com.example.airline_api.controllers;

import com.example.airline_api.models.Booking;
import com.example.airline_api.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    // TODO: Display all bookings
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
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
