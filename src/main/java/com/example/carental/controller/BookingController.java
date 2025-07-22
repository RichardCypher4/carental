package com.example.carental.controller;

import com.example.carental.model.UserBooking;
import com.example.carental.repository.UserBookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final UserBookingRepository bookingRepository;

    @PostMapping
    public UserBooking createBooking(@RequestBody UserBooking booking) {
        return bookingRepository.save(booking);
    }

    @GetMapping
    public List<UserBooking> getAllBookings() {
        return bookingRepository.findAll();
    }
}