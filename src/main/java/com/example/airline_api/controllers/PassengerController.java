package com.example.airline_api.controllers;

import com.example.airline_api.models.Passenger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    // TODO: Display details of all passengers
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        return null;
    }

    // TODO: Display specific passenger details
    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(){
        return null;
    }

    // TODO: Add a new passenger
    @PostMapping
    public ResponseEntity<Passenger> addNewPassenger(){
        return null;
    }

}
