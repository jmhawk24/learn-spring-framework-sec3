package com.learningspring.learningspringframeworksec3.examples.b2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private ADependency dep;

    public SomeClass(ADependency dep) {
        System.out.println("wiring up");
        this.dep = dep;
    }

    //want to do something as soon as all initialization complete
    @PostConstruct
    public void initialize() {
        dep.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("deleting entire database");
    }
}

@Component
class ADependency {

    public void getReady() {
        System.out.println("Getting revved up for a big night.");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             PrePostAnnotationsContextLauncherApplication.class
                     )) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
