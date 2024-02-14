package org.example.strategy;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyingBehaviour = new FlyNoWay();
    }
}
