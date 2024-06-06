package com.example.airline_api.models;

public class BookingDTO {

    private long passengerId;
    private long flightId;
    private int seatNumber;
    private String mealPreference;

    public BookingDTO(long passengerId, long flightId, int seatNumber, String mealPreference) {
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.seatNumber = seatNumber;
        this.mealPreference = mealPreference;
    }

    public BookingDTO() {
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMealPreference() {
        return mealPreference;
    }

    public void setMealPreference(String mealPreference) {
        this.mealPreference = mealPreference;
    }


}
