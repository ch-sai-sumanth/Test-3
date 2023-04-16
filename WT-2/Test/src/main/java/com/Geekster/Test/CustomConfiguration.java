package com.Geekster.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CustomConfiguration {

    @Bean("sumanth")
    public Employee getEmp()
    {
        System.out.println("This is from custom Configuration");
        return new Employee("Sumanth","Engineer",514,50000);
    }
}
