package com.xworkz.bigbasketApp;

import com.xworkz.bigbasketApp.Constants.Payment;
import com.xworkz.bigbasketApp.bigbasket.BigBasket;
import com.xworkz.bigbasketApp.bigbasketdto.BigbasketDto;

public class BigBasketRunner {
    public static void main(String arg[]){

        BigbasketDto bigbasketDto = new BigbasketDto();
        bigbasketDto.setEmail("baaba@gmail.com");
        bigbasketDto.setName("baba");
        bigbasketDto.setPhnNo(999888777l);
        bigbasketDto.setPaymentInformation(Payment.card);

        BigBasket bigBasket = new BigBasket();
        if(bigBasket.User(bigbasketDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
        System.out.println("----------------------");
   }
}
