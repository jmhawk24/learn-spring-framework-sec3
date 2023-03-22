package com.learningspring.learningspringframeworksec3.examples.b3;

import com.learningspring.learningspringframeworksec3.examples.businesscalcexercise.DataServiceInterface;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component // switch to CDI with @Named
@Named
class BusinessService {
    private DataService dataService;

//    @Autowired // this is an error - autowired needs to be on the setter, not getter
    public DataService getDataService() {
        return dataService;
    }

//    @Autowired
    @Inject  // use this with Jakarta Inject with @Named above
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }


}

//@Component
@Named
class DataService {}


@Configuration
@ComponentScan // no specification tells it to use the current package
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             CdiContextLauncherApplication.class
                     )) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
