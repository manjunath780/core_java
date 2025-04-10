package com.xworkz.inheritance;

import com.xworkz.inheritance.accessory.Accessory;
import com.xworkz.inheritance.wallet.Wallet;

public class AccessoryRunner {
    public static void main(String[] args) {
        Accessory accessory = new Accessory();
        accessory.carry();
        accessory.use();

        Wallet wallet = new Wallet();
        wallet.carry();
        wallet.use();
    }
}
