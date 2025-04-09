package com.xworkz.instagramapp;

import com.xworkz.instagramapp.constants.Gender;
import com.xworkz.instagramapp.instagramdto.InstagramDto;
import com.xworkz.instagramapp.generateinstagram.Instagram;

public class InstagramRunner {

    public static void main(String[] args) {


        InstagramDto instagramDto = new InstagramDto();
        instagramDto.setFirstName("baba");
        instagramDto.setLastName("bab ");
        instagramDto.setDob("08/04/2000");
        instagramDto.setGender(Gender.Male);
        instagramDto.setEmail("baba@gmail.com");
        instagramDto.setMobile("9999888877");
        instagramDto.setUserName("baba");
        instagramDto.setPassword("bab@1234");

        System.out.println("The First Name: " + instagramDto.getFirstName());
        System.out.println("The Last Name: " + instagramDto.getLastName());
        System.out.println("The DOB: " + instagramDto.getDob());
        System.out.println("The Gender: " + instagramDto.getGender());
        System.out.println("The Email: " + instagramDto.getEmail());
        System.out.println("The Mobile: " + instagramDto.getMobile());
        System.out.println("The Username: " + instagramDto.getUserName());
        System.out.println("The Password: " + instagramDto.getPassword());

        System.out.println("--------*--------**------*------------");

        Instagram instagram = new Instagram();
        instagram.newAccount(instagramDto);
    }
}
