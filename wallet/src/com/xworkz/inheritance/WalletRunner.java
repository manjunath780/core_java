package com.xworkz.inheritance;

import com.xworkz.inheritance.accessory.Accessory;
import com.xworkz.inheritance.wallet.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Accessory accessory = new Wallet();
        Wallet wallet = (Wallet) accessory;
        System.out.println(wallet);
    }
}
