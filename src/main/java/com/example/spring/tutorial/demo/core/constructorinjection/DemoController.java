package com.example.spring.tutorial.demo.core.constructorinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private MyCoach myCoach;

    // Constructor Injection
    /*@Autowired
    public DemoController(Coach coach){
        this.myCoach = coach;
    }*/

    // setter injection
    @Autowired
    public void setMyCoach(MyCoach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
