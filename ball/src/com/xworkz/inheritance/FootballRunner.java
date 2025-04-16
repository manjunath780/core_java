package com.xworkz.inheritance;

import com.xworkz.inheritance.ball.Ball;
import com.xworkz.inheritance.football.Football;

public class FootballRunner {
    public static void main(String[] args) {
        Ball ball = new Football();
        Football football = (Football) ball;
        System.out.println(ball);
    }
}
