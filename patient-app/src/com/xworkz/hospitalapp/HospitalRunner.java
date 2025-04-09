package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.record.Hospital;

public class HospitalRunner {

    public static void main(String[] args) {


        PatientDto patientDto = new PatientDto();
        patientDto.setPatientName("baba");
        patientDto.setAge(22);
        patientDto.setDob("q1/02/2003");
        patientDto.setGender("Male");
        patientDto.setEmail("baba@gmail.com");
        patientDto.setContactNumber("9999888877");
        patientDto.setBloodGroup(BloodGroup.O_POSITIVE);
        patientDto.setDiagnosis(" viral Fever");

        System.out.println("Patient Name: " + patientDto.getPatientName());
        System.out.println("Age: " + patientDto.getAge());
        System.out.println("DOB: " + patientDto.getDob());
        System.out.println("Gender: " + patientDto.getGender());

        System.out.println("Diagnosis: " + patientDto.getDiagnosis());
        System.out.println("Email: " + patientDto.getEmail());
        System.out.println("Contact: " + patientDto.getContactNumber());
        System.out.println("Blood Group: " + patientDto.getBloodGroup());

        System.out.println("-----------------**------------------");

        Hospital hospital = new Hospital();
        hospital.registerPatient(patientDto);
    }
}
