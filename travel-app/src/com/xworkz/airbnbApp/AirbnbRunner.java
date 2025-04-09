package com.xworkz.airbnbApp;

import com.xworkz.airbnbApp.Constants.Payment;
import com.xworkz.airbnbApp.airbnb.Airbnb;
import com.xworkz.airbnbApp.airbnbdto.AirbnbDto;



public class AirbnbRunner {
    public static void main(String arg[]){

        AirbnbDto airbnbDto = new AirbnbDto();
        airbnbDto.setEmail("baba@gmail,com");
        airbnbDto.setName("baba");
        airbnbDto.setPhnNo(9988776655l);
        airbnbDto.setTravelType(Preferences.bus);
        airbnbDto.setPaymentType(Payment.cod);

        Airbnb airbnb = new Airbnb();
        if(airbnb.User(airbnbDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
        System.out.println("-----------------------");
    }
}
