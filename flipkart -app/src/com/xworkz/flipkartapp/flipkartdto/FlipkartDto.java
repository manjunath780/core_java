package com.xworkz.flipkartapp.flipkartdto;

import com.xworkz.flipkartapp.constants.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlipkartDto {

    private String customerName;
    private String email;
    private String address;
    private String contactNumber;
    private String productName;
    private int quantity;
    private double price;
    private PaymentMethod paymentMethod;


}
