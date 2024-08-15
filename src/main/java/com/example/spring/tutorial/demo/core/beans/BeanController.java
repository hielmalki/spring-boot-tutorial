package com.example.spring.tutorial.demo.core.beans;


import com.example.spring.tutorial.demo.core.qualifiers.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beans")
public class BeanController {

    private Coach cricketCoach1;
    private Coach cricketCoach2;

    @Autowired
    public BeanController(@Qualifier("swimCoach") Coach cricketCoach1,
                          @Qualifier("cricketCoach") Coach cricketCoach2){
        this.cricketCoach1 = cricketCoach1;
        this.cricketCoach2 = cricketCoach2;
    }

    @GetMapping("/check")
    public boolean compare(){
        return this.cricketCoach1 == this.cricketCoach2;
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return this.cricketCoach1.getDailyWorkout();
    }

}
