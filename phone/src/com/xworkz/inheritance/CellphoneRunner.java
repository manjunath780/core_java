package com.xworkz.inheritance;

import com.xworkz.inheritance.cellphone.Cellphone;
import com.xworkz.inheritance.device.Device;

public class CellphoneRunner {
    public static void main(String[] args) {
        Device device = new Cellphone();
        Cellphone cellphone = (Cellphone) device;
        System.out.println(cellphone);
    }
}
