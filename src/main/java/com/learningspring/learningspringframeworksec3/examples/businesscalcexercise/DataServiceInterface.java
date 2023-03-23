package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface DataServiceInterface {
    int[] retrieveData();
}
