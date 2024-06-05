package com.example.airline_api.components;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

    @Autowired
    BookingRepository bookingRepository;

    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("Singapore",800,"01072024","17:00");
        flightService.saveFlight(flight1);

        Passenger passenger1 = new Passenger("Adil","adil@hotmail.com");
        passengerService.savePassenger(passenger1);

        Booking booking1 = new Booking(flight1,passenger1,1);
        bookingRepository.save(booking1);

        Passenger passenger2 = new Passenger("Bob","bob@hotmail.com");;
        passengerService.savePassenger(passenger2);

        Booking booking2 = new Booking(flight1,passenger2,2);
        bookingRepository.save(booking2);

        Flight flight2 = new Flight("New York",600,"05072024","21:00");
        flightService.saveFlight(flight2);

        Passenger passenger3 = new Passenger("Rob","rob@hotmail.com");;
        passengerService.savePassenger(passenger3);

        Booking booking3 = new Booking(flight2,passenger3,1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking(flight2,passenger1,2);
        bookingRepository.save(booking4);



    }


}
