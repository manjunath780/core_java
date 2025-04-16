package com.xworkz.inheritance;

import com.xworkz.inheritance.protection.Protection;
import com.xworkz.inheritance.helmet.Helmet;

public class ProtectionRunner {
    public static void main(String[] args) {
        Protection protection = new Protection();
        protection.protectFromInjury();
        protection.safetyGear();
        protection.madeOfStrongMaterial();
        protection.usedInSports();
        protection.wornOnBody();

        Protection protectionRef = new Helmet();
        protectionRef.protectFromInjury();
        protectionRef.safetyGear();
        protectionRef.madeOfStrongMaterial();
        protectionRef.usedInSports();
        protectionRef.wornOnBody();

        Helmet helmet = new Helmet();
        helmet.protectFromInjury();
        helmet.safetyGear();
        helmet.wornOnHead();
        helmet.hasVisor();
        helmet.usedByRiders();
}}
