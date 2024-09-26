package com.headfirst.design.patterns.strategy;

/**
 *
 * @author Joaquin
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
