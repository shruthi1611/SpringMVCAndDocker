package com.example.configuration;

import com.example.controller.StudentController;
import com.example.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by shona on 26/02/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class ApplicationConfig extends WebMvcConfigurerAdapter {
    @Bean
    public StudentController studentController() {
        return new StudentController();
    }
}
