package com.example.spring.tutorial.demo.core.qualifiers.rest;

import com.example.spring.tutorial.demo.core.qualifiers.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public Controller(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
