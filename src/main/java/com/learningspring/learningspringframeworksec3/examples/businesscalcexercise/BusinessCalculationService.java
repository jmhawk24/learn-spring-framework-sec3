package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {

    DataServiceInterface ds;

    public BusinessCalculationService(DataServiceInterface ds) {
        this.ds = ds;
    }

    public int findMax() {
        return Arrays.stream(ds.retrieveData())
                .max().orElse(0);
    }
}
