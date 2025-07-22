package com.example.carental.repository;

import com.example.carental.model.CarModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarModelRepository extends MongoRepository<CarModel, String> {}