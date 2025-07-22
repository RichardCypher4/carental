package com.example.carental.repository;

import com.example.carental.model.UserBooking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserBookingRepository extends MongoRepository<UserBooking, String> {}