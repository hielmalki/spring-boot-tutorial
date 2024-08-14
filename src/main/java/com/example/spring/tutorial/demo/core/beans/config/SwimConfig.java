package com.example.spring.tutorial.demo.core.beans.config;

import com.example.spring.tutorial.demo.core.beans.SwimCoach;
import com.example.spring.tutorial.demo.core.qualifiers.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
