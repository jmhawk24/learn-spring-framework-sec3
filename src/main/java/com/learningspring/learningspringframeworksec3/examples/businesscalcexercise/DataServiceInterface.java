package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.stereotype.Component;

@Component
public interface DataServiceInterface {
    int[] retrieveData();
}
