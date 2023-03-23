package com.learningspring.learningspringframeworksec3.examples.businesscalcexercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysqlQualifier")
public class MySQLDataService implements DataServiceInterface {
    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
