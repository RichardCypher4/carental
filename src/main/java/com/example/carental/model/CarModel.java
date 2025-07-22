package com.example.carental.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "car_models")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarModel {
    @Id
    private String id;
    private String model;
    private int passengerCapacity;
    private int luggageCapacity;
    private int halfDayPrice;
    private int fullDayPrice;
    private int additionalHourPrice;
    private int airportTransferPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public int getHalfDayPrice() {
        return halfDayPrice;
    }

    public void setHalfDayPrice(int halfDayPrice) {
        this.halfDayPrice = halfDayPrice;
    }

    public int getFullDayPrice() {
        return fullDayPrice;
    }

    public void setFullDayPrice(int fullDayPrice) {
        this.fullDayPrice = fullDayPrice;
    }

    public int getAdditionalHourPrice() {
        return additionalHourPrice;
    }

    public void setAdditionalHourPrice(int additionalHourPrice) {
        this.additionalHourPrice = additionalHourPrice;
    }

    public int getAirportTransferPrice() {
        return airportTransferPrice;
    }

    public void setAirportTransferPrice(int airportTransferPrice) {
        this.airportTransferPrice = airportTransferPrice;
    }
}