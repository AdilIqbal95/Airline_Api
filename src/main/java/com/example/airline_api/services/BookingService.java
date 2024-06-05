package com.example.airline_api.services;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

    public List<Booking> getAllPassengers() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getPassengerById(long id) {
        return bookingRepository.findById(id);
    }

    public void deleteBooking(long id) {
        bookingRepository.deleteById(id);
    }

//    TODO - saveBooking

}
