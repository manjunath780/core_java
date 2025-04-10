package com.xworkz.inheritance;

import com.xworkz.inheritance.device.Device;
import com.xworkz.inheritance.cellphone.Cellphone;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.turnOn();

        Cellphone cellphone = new Cellphone();
        cellphone.turnOn();
    }
}
