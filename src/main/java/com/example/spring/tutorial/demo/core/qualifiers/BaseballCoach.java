package com.example.spring.tutorial.demo.core.qualifiers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Lazy
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }

    @Override
    public String getCoachName() {
        return "Denis";
    }
}
