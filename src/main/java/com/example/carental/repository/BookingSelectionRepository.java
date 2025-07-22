package com.example.carental.repository;

import com.example.carental.model.BookingSelection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingSelectionRepository extends MongoRepository<BookingSelection, String> {}