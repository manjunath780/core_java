package com.xworkz.insurance;

import com.xworkz.insurance.constants.PolicyType;
import com.xworkz.insurance.dto.InsurancePolicyDto;
import com.xworkz.insurance.policy.InsurancePolicy;

public class InsurancePolicyRunner {

    public static void main(String[] args) {


        InsurancePolicyDto dto = new InsurancePolicyDto();
        dto.setPolicyHolderName("baba");
        dto.setEmail("baba@gmail.com");
        dto.setAddress("yelahanka, Bangalore");
        dto.setContactNumber("9998887770");
        dto.setPolicyName("life insurance");
        dto.setCoverageAmount(500000.00);
        dto.setPremium(5000.00);
        dto.setPolicyType(PolicyType.LIFE);

        System.out.println("Policy Holder Name: " + dto.getPolicyHolderName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Policy Name: " + dto.getPolicyName());
        System.out.println("Coverage Amount: " + dto.getCoverageAmount());
        System.out.println("Premium: " + dto.getPremium());
        System.out.println("Policy Type: " + dto.getPolicyType());

        System.out.println("-------------------**---------------------");

        InsurancePolicy policy = new InsurancePolicy();
        policy.createPolicy(dto);
    }
}
