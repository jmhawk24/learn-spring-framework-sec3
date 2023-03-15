package com.learningspring.learningspringframeworksec3.examples.a1;

import com.learningspring.learnspringframeworksec3.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    Dependency1 dep1;

    Dependency2 dep2;

    @Autowired
    public YourBusinessClass(Dependency1 dep1, Dependency2 dep2) {
        System.out.println("Constructor injection");
        this.dep1 = dep1;
        this.dep2 = dep2;
    }

//        @Autowired
    public void setDep1(Dependency1 dep1) {
        this.dep1 = dep1;
    }

//    @Autowired
    public void setDep2(Dependency2 dep2) {
        this.dep2 = dep2;
    }

    public String toString() {
        return "dep1: " + dep1 + " || dep2: " + dep2;
    }
}

@Component
class Dependency1 {

        }

@Component
class Dependency2 {

}
@Configuration
@ComponentScan // no specification tells it to use the current package
public class DependencyInjectionGameLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             DependencyInjectionGameLauncherApplication.class
                     )) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class).toString());
        }
    }
}
