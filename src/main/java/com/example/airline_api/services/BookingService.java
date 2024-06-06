package com.example.airline_api.services;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.BookingDTO;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
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

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(long id) {
        return bookingRepository.findById(id);
    }

    public void deleteBooking(long id) {
        bookingRepository.deleteById(id);
    }

    public Booking saveBooking(BookingDTO bookingDTO) {
        Passenger passenger = passengerService.getPassengerById(bookingDTO.getPassengerId()).get();
        Flight flight = flightService.getFlightById(bookingDTO.getFlightId()).get();

        Booking booking = new Booking(flight,passenger,bookingDTO.getSeatNumber());

        bookingRepository.save(booking);
        return booking;
    }

    public void updateMeal(BookingDTO bookingDTO, long id) {
        Booking bookingToUpdate = bookingRepository.findById(id).get();
        bookingToUpdate.setMealPreference(bookingDTO.getMealPreference());
        bookingRepository.save(bookingToUpdate);
    }


}
