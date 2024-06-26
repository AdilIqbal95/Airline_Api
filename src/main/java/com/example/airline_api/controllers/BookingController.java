package com.example.airline_api.controllers;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.BookingDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Booking>> addNewBooking(@RequestBody BookingDTO bookingDTO){
        bookingService.saveBooking(bookingDTO);
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Booking> updateMealPreference(
            @RequestBody BookingDTO bookingDTO,
            @PathVariable long id){
        Optional<Booking> booking = bookingService.getBookingById(id);
        if (booking.isPresent()) {
            bookingService.updateMeal(bookingDTO, id);
            return new ResponseEntity<>(bookingService.getBookingById(id).get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
