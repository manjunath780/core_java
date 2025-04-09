package com.xworkz.passport;

import com.xworkz.passport.Constants.CpvLocation;
import com.xworkz.passport.Constants.DcdrLocation;
import com.xworkz.passport.generatepassport.PassportSeva;
import com.xworkz.passport.passportDto.PassportDto;

public class PassportRunner {
    public static void main(String arg []){

        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocation(CpvLocation.Passportoffice);
        passportDto.setDcdrLocation(DcdrLocation.Mysore);
        passportDto.setGivenName("baba");
        passportDto.setSurName("bb");
        passportDto.setDob("1/1/2000");
        passportDto.setEmailId("baba@gmail.com");
        passportDto.setEmailIdSameAsLoginId("baba@gmail.com");
        passportDto.setLoginId("baba");
        passportDto.setPassword("babababa");
        passportDto.setConfirmPassword("babababa");

        PassportSeva passportSeva = new PassportSeva();
       if( passportSeva.registerUser(passportDto)){
           System.out.println("successfull");
       }
       else
           System.out.println("unsuccessfull");

        System.out.println("______________");



    }
}
