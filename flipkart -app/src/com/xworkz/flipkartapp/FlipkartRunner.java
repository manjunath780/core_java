package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.constants.PaymentMethod;
import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;
import com.xworkz.flipkartapp.generateflipkart.Flipkart;

public class FlipkartRunner {

    public static void main(String[] args) {


        FlipkartDto dto = new FlipkartDto();
        dto.setCustomerName("baba");
        dto.setEmail("baba@gmail.com");
        dto.setAddress("yelahanka, Bangalore");
        dto.setContactNumber("999954388");
        dto.setProductName("smart watch");
        dto.setQuantity(1);
        dto.setPrice(1499.50);
        dto.setPaymentMethod(PaymentMethod.UPI);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Product: " + dto.getProductName());
        System.out.println("Quantity: " + dto.getQuantity());
        System.out.println("Price: " + dto.getPrice());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("----------------------------------");

        Flipkart flipkart = new Flipkart();
        flipkart.placeOrder(dto);
    }
}
