
package com.xworkz.twitterapp.twitterdto;

import com.xworkz.twitterapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TwitterDto {
    
    private String fullName;
    private String dob;
    private Gender gender;
    private String email;
    private String mobile;
    private String password;
    private String userName;


}
