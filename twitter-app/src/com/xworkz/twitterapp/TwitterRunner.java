
package com.xworkz.twitterapp;

import com.xworkz.twitterapp.constants.Gender;
import com.xworkz.twitterapp.twitterdto.TwitterDto;
import com.xworkz.twitterapp.generatetwitter.Twitter;

public class TwitterRunner {

    public static void main(String[] args) {


        TwitterDto twitterDto = new TwitterDto();
        twitterDto.setFullName("baba");
        twitterDto.setDob("01/04/2000");
        twitterDto.setGender(Gender.Male);
        twitterDto.setEmail("baba@gmail.com");
        twitterDto.setMobile("9988776655");
        twitterDto.setUserName("baba");
        twitterDto.setPassword("babababab");

        System.out.println("The Full Name: " + twitterDto.getFullName());
        System.out.println("The DOB: " + twitterDto.getDob());
        System.out.println("The Gender: " + twitterDto.getGender());
        System.out.println("The Email: " + twitterDto.getEmail());
        System.out.println("The Mobile: " + twitterDto.getMobile());
        System.out.println("The Username: " + twitterDto.getUserName());
        System.out.println("The Password: " + twitterDto.getPassword());

        System.out.println("---------------***---------------");

        Twitter twitter = new Twitter();
        twitter.newAccount(twitterDto);
    }
}
