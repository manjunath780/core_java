package com.xworkz.passport.passportDto;

import com.xworkz.passport.Constants.CpvLocation;
import com.xworkz.passport.Constants.DcdrLocation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassportDto {
    private CpvLocation cpvLocation;
    private DcdrLocation dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String emailId;
    private String emailIdSameAsLoginId;
    private String loginId;
    private String password;
    private String confirmPassword;


}