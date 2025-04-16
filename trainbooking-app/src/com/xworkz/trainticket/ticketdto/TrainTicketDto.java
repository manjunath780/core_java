package com.xworkz.trainticket.ticketdto;

import com.xworkz.trainticket.constants.TicketClass;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class TrainTicketDto {

    private String passengerName;
    private String departureStation;
    private String arrivalStation;
    private String journeyDate;
    private TicketClass ticketClass;
    private int numberOfPassengers;
    private String contactNumber;
    private String email;


}
