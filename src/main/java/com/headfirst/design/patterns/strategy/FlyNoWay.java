package com.headfirst.design.patterns.strategy;

/**
 *
 * @author Joaquin
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
