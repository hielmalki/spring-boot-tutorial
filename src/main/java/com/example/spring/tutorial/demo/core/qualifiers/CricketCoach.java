package com.example.spring.tutorial.demo.core.qualifiers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CricketCoach implements Coach {

    public CricketCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.....";
    }

    @Override
    public String getCoachName() {
        return "Lisa";
    }
}
