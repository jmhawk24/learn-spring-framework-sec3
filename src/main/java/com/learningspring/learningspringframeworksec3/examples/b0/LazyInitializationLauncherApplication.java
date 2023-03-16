package com.learningspring.learningspringframeworksec3.examples.b0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {}

@Component
@Lazy
class ClassB {

    private ClassA a;
    public ClassB(ClassA a) {
        System.out.println("Initializing ClassB - logic goes here.");
        this.a = a;
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             LazyInitializationLauncherApplication.class
                     )) {
            System.out.println("completed init");
            System.out.println(context.getBean(ClassB.class));
        }
    }
}
