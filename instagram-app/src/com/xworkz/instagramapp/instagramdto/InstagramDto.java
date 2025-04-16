package com.xworkz.instagramapp.instagramdto;

import com.xworkz.instagramapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InstagramDto {

    private String firstName;
    private String lastName;
    private String dob;
    private Gender gender;
    private String email;
    private String mobile;
    private String password;
    private String userName;


}
