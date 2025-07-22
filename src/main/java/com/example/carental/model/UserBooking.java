package com.example.carental.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBooking {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public int getVehicleQuantity() {
        return vehicleQuantity;
    }

    public void setVehicleQuantity(int vehicleQuantity) {
        this.vehicleQuantity = vehicleQuantity;
    }

    private String fullName;
    private String email;
    private String phone;
    private int age;
    private String pickupDate;
    private String serviceType;
    private String city;
    private String vehicleType;
    private String vehicleYear;
    private int vehicleQuantity;
}