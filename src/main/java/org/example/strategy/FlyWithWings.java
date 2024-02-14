package org.example.strategy;

public class FlyWithWings implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("The Duck is flying");
    }
}
