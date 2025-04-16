package com.xworkz.inheritance;

import com.xworkz.inheritance.device.Device;
import com.xworkz.inheritance.cellphone.Cellphone;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.powerOn();
        device.powerOff();
        device.hasBattery();
        device.madeByCompany();
        device.usedForCommunication();

        Device deviceRef = new Cellphone(); // Upcasting
        deviceRef.powerOn();
        deviceRef.powerOff();
        deviceRef.hasBattery();
        deviceRef.madeByCompany();
        deviceRef.usedForCommunication();

        Cellphone phone = new Cellphone();
        phone.powerOn();
        phone.hasBattery();
        phone.makeCalls();
        phone.sendMessages();
        phone.hasTouchscreen();


    }
}
