package org.example.strategy;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    public void performFly() {
        flyingBehaviour.fly();
    }
}
