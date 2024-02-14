package org.example.strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyingBehaviour = new FlyWithWings();
    }
}
