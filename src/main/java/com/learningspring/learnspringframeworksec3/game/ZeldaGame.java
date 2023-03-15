package com.learningspring.learnspringframeworksec3.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ZeldaGame implements GameConsole {
    public void up() {
        System.out.println("Climb everything");
    }

    @Override
    public void down() {
        System.out.println("Throw a bomb");
    }

    @Override
    public void left() {
        System.out.println("Shield up");
    }

    @Override
    public void right() {
        System.out.println("Slash dem baddies");
    }
}
