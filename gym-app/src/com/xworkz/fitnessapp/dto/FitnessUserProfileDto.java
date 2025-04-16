package com.xworkz.fitnessapp.dto;

import com.xworkz.fitnessapp.constants.FitnessGoal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FitnessUserProfileDto {

    private String userName;
    private String email;
    private int age;
    private double weight;
    private double height;
    private FitnessGoal goal;
    private String preferredWorkoutTime;


}
