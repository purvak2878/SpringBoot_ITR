package com.itr.sample.common;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Lazy
@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In constructor: BaseballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

}
