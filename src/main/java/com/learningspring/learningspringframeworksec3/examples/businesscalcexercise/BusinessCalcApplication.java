package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalcApplication {
    public static void main(String[] args) {
        try (var context =
                new AnnotationConfigApplicationContext(
                        BusinessCalcApplication.class
                )) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
