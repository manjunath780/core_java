package com.xworkz.airbnbApp.airbnbdto;

import com.xworkz.airbnbApp.Constants.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.prefs.Preferences;
@Getter
@Setter
public class AirbnbDto {
    private String name;
    private String email;
    private long phnNo;
    private Preferences travelType;
    private Payment paymentType;


}
