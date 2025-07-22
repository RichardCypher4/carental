package com.example.carental.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "booking_selections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingSelection {
    @Id
    private String id;
    private String userBookingId;
    private String carModelId;
    private List<String> selectedServices;
    private int totalCost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserBookingId() {
        return userBookingId;
    }

    public void setUserBookingId(String userBookingId) {
        this.userBookingId = userBookingId;
    }

    public String getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(String carModelId) {
        this.carModelId = carModelId;
    }

    public List<String> getSelectedServices() {
        return selectedServices;
    }

    public void setSelectedServices(List<String> selectedServices) {
        this.selectedServices = selectedServices;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}