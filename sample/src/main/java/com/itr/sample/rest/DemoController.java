package com.itr.sample.rest;
import com.itr.sample.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;

@RestController
public class DemoController {

    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("FootCoach") Coach fb) {
       System.out.println("I am in Constructor:"+getClass().getSimpleName());
       myCoach=fb;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
