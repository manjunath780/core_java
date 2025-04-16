package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.constants.Gender;
import com.xworkz.snapchatapp.snapchatdto.SnapchatDto;
import com.xworkz.snapchatapp.generatesnapchat.Snapchat;

public class SnapchatRunner {

    public static void main(String[] args) {


        SnapchatDto snapchatDto = new SnapchatDto();
        snapchatDto.setFirstName("baba");
        snapchatDto.setLastName("baaabaa");
        snapchatDto.setDob("21/03/2000");
        snapchatDto.setGender(Gender.female);
        snapchatDto.setEmail("baba@gmaail.com");
        snapchatDto.setMobile("9998887772");
        snapchatDto.setUserName("baba");
        snapchatDto.setPassword("baaaabaaaa");

        System.out.println("The First Name: " + snapchatDto.getFirstName());
        System.out.println("The Last Name: " + snapchatDto.getLastName());
        System.out.println("The DOB: " + snapchatDto.getDob());
        System.out.println("The Gender: " + snapchatDto.getGender());
        System.out.println("The Email: " + snapchatDto.getEmail());
        System.out.println("The Mobile: " + snapchatDto.getMobile());
        System.out.println("The Username: " + snapchatDto.getUserName());
        System.out.println("The Password: " + snapchatDto.getPassword());

        System.out.println("----------------****------------------");

        Snapchat snapchat = new Snapchat();
        snapchat.newAccount(snapchatDto);
    }
}
