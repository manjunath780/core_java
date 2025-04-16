package com.xworkz.amazonapp.amazondto;

import com.xworkz.amazonapp.constants.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AmazonDto {

    private String customerName;
    private String email;
    private String address;
    private String contactNumber;
    private String productName;
    private int quantity;
    private double price;
    private PaymentMethod paymentMethod;


}
