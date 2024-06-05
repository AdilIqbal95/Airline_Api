package com.example.airline_api.controllers;

import com.example.airline_api.models.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    // TODO: Display all available flights
    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        return null;
    }

    // TODO: Display a specific flight
    @GetMapping(value = "/{id}")
    public ResponseEntity<Flight> getFlightById(){
        return null;
    }

    // TODO: Add details of a new flight
    @PostMapping
    public ResponseEntity<Flight> addNewFlight(){
        return null;
    }

    // TODO: Extension - Cancel flight
    @DeleteMapping(value = "/{id}")
    public ResponseEntity cancelFlight(){
        return null;
    }

}
