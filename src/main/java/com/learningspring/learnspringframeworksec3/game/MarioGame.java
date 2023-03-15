package com.learningspring.learnspringframeworksec3.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole{

    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("go back");
    }

    public void right() {
        System.out.println("Move forward");
    }
}
