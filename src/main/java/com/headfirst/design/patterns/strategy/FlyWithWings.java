package com.headfirst.design.patterns.strategy;

/**
 *
 * @author Joaquin
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
