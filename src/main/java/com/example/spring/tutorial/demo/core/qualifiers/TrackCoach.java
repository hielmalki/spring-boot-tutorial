package com.example.spring.tutorial.demo.core.qualifiers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TrackCoach implements Coach {
    public TrackCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @Override
    public String getCoachName() {
        return "Mr. Carlo";
    }
}
