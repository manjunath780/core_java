package com.xworkz.bigbasketApp.bigbasketdto;

import com.xworkz.bigbasketApp.Constants.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BigbasketDto {
    private String name;
    private String email;
    private long phnNo;
    private Payment paymentInformation;
}