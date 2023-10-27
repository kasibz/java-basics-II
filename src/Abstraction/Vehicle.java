package Abstraction;

public abstract class Vehicle {
    protected int wheels;
    protected int axles;
    protected int mpg;

    public Vehicle(int wheels, int axles, int mpg) {
        this.wheels = wheels;
        this.axles = axles;
        this.mpg = mpg;
    }
}