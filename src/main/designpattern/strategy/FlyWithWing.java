package main.designpattern.strategy;

class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with wing.");
    }
}
