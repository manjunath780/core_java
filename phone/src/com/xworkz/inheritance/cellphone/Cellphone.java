package com.xworkz.inheritance.cellphone;

import com.xworkz.inheritance.device.Device;

public class Cellphone extends Device {

    public void makeCalls() {
        System.out.println("Cellphone can make and receive calls");
    }

    public void sendMessages() {
        System.out.println("Cellphone can send text messages");
    }

    public void runApps() {
        System.out.println("Cellphone can run various apps");
    }

    public void hasTouchscreen() {
        System.out.println("Cellphone usually has a touchscreen");
    }
}
