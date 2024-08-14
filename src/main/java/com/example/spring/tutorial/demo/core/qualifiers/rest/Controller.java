package com.example.spring.tutorial.demo.core.qualifiers.rest;

import com.example.spring.tutorial.demo.core.qualifiers.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class Controller {

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    private Controller(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public ResponseEntity<String> getDailyWorkout() {
        return new ResponseEntity<>(myCoach.getDailyWorkout(), HttpStatus.OK);
    }

    @GetMapping("/coach-name")
    public ResponseEntity<String> getCoachName() {
        return new ResponseEntity<>(myCoach.getCoachName(), HttpStatus.OK);
    }
}
