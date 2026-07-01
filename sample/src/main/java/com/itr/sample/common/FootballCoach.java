package com.itr.sample.common;

import org.springframework.stereotype.Component;


public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("I am in Football Coach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Achieving Goals for 20 Mins";
    }
}
