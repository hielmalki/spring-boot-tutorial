package com.example.spring.tutorial.demo.core.qualifiers;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        log.info("In constructor: {}", getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff() {
        log.info("In doMyStartupStuff(): {}", getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        log.info("In doMyCleanupStuff(): {}", getClass().getSimpleName());
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
