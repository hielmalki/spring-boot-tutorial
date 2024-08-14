package com.example.spring.tutorial.demo.core.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements MyCoach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
