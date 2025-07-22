package com.example.carental.controller;

import com.example.carental.model.CarModel;
import com.example.carental.repository.CarModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarModelController {

    private final CarModelRepository carRepo;

    @PostMapping
    public CarModel addCarModel(@RequestBody CarModel carModel) {
        return carRepo.save(carModel);
    }

    @GetMapping
    public List<CarModel> getAllCarModels() {
        return carRepo.findAll();
    }
}