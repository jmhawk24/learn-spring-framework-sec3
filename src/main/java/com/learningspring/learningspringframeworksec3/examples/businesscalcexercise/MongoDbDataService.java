package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataServiceInterface {
    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55};
    }
}
