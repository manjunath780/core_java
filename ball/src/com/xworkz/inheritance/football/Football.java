package com.xworkz.inheritance.football;

import com.xworkz.inheritance.ball.Ball;

public class Football extends Ball {

    public void usedInMatches() {
        System.out.println("Football is used in soccer matches");
    }

    public void largerSize() {
        System.out.println("Football is larger than a tennis ball");
    }

    public void stitchedPanels() {
        System.out.println("Football has stitched panels");
    }

    public void leatherMaterial() {
        System.out.println("Football is made of synthetic leather");
        System.out.println("*********");
    }
}