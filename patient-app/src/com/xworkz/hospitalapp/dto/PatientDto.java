package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constants.BloodGroup;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class PatientDto {

    private String patientName;
    private int age;
    private String dob;
    private String gender;
    private String email;
    private String contactNumber;
    private BloodGroup bloodGroup;
    private String diagnosis;

}