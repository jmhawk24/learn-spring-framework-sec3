package com.learningspring.learnspringframeworksec3.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.learningspring.learnspringframeworksec3.game")
public class GameLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             GameLauncherApplication.class
                     )) {
            context.getBean(GameRunner.class).run();
        }
    }
}
