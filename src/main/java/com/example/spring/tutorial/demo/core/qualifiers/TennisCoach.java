package com.example.spring.tutorial.demo.core.qualifiers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TennisCoach implements Coach {
    public TennisCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getCoachName() {
        return "Rafael Nadal";
    }
}
