package com.xworkz.makemytrip.dto;

import com.xworkz.makemytrip.constants.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MakeMyTripDto {

    private String passengerName;
    private String email;
    private String contactNumber;
    private String departureCity;
    private String arrivalCity;
    private String travelDate;
    private int numberOfPassengers;
    private double fare;
    private PaymentMethod paymentMethod;
}