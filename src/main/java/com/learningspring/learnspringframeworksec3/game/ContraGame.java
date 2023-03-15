package com.learningspring.learnspringframeworksec3.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GameConsole {

    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("sit on your ass");
    }

    public void left() {
        System.out.println("puff your chest");
    }

    public void right() {
        System.out.println("shoot your gun");
    }
}
