package com.itr.sample.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: CricketCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
    @PostConstruct
    public void Setdata(){
        System.out.println("Resources Allocated");
    }
    @PreDestroy
    public void putdata(){
        System.out.println("Resources Released");
    }
}
