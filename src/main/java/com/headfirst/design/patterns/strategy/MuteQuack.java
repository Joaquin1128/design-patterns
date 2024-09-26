package com.headfirst.design.patterns.strategy;

/**
 *
 * @author Joaquin
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
