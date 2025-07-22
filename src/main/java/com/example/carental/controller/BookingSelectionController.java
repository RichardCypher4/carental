package com.example.carental.controller;

import com.example.carental.model.BookingSelection;
import com.example.carental.repository.BookingSelectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/selections")
@RequiredArgsConstructor
public class BookingSelectionController {

    private final BookingSelectionRepository selectionRepo;

    @PostMapping
    public BookingSelection makeSelection(@RequestBody BookingSelection selection) {
        return selectionRepo.save(selection);
    }

    @GetMapping
    public List<BookingSelection> getAllSelections() {
        return selectionRepo.findAll();
    }
}