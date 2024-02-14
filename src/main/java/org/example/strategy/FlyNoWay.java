package org.example.strategy;

public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Sorry, the duck can't fly");
    }
}
