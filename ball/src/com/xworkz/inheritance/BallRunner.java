package com.xworkz.inheritance;

import com.xworkz.inheritance.ball.Ball;
import com.xworkz.inheritance.football.Football;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.bounce();
        ball.roll();
        ball.hasAir();
        ball.madeOfRubber();
        ball.spherical();



        Ball football = new Football();
        football.bounce();
        football.roll();
        football.hasAir();
        football.madeOfRubber();
        football.spherical();

        Football football1 = new Football();
        football1.hasAir();
        football1.usedInMatches();
        football1.largerSize();
        football1.stitchedPanels();
        football1.leatherMaterial();






    }
}