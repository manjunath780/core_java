package com.xworkz.amazonapp;

import com.xworkz.amazonapp.constants.PaymentMethod;
import com.xworkz.amazonapp.amazondto.AmazonDto;
import com.xworkz.amazonapp.generateamazon.Amazon;

public class AmazonRunner {

    public static void main(String[] args) {


        AmazonDto dto = new AmazonDto();
        dto.setCustomerName("");
        dto.setEmail("manju@gmail.com");
        dto.setAddress("yelahanka, Bangalore");
        dto.setContactNumber("9998887776");
        dto.setProductName("laptop");
        dto.setQuantity(1);
        dto.setPrice(75000.00);
        dto.setPaymentMethod(PaymentMethod.CREDIT_CARD);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Product: " + dto.getProductName());
        System.out.println("Quantity: " + dto.getQuantity());
        System.out.println("Price: " + dto.getPrice());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("--------------*-----------*---------");

        Amazon amazon = new Amazon();
        amazon.Order(dto);
        //amazon.validateOrder(dto);
    }


}
