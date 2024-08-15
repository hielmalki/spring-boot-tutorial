package com.example.spring.tutorial.demo.core.beans;

import com.example.spring.tutorial.demo.core.qualifiers.Coach;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwimCoach implements Coach {


    public SwimCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "swim 1000m as warm up";
    }

    @Override
    public String getCoachName() {
        return null;
    }
}
