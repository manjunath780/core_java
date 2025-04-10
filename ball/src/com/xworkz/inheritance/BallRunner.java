package com.xworkz.inheritance;

import com.xworkz.inheritance.ball.Ball;
import com.xworkz.inheritance.football.Football;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.bounce();
        ball.roll();

        Football football = new Football();
        football.bounce();
        football.roll();
    }
}