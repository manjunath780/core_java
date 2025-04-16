package com.xworkz.tinderApp.tinderdto;

import com.xworkz.tinderApp.Constants.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class TinderDto {
    private String name;
    private String email;
    private long phnNo;
    private Gender gender;

}