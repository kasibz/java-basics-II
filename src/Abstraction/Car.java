package Abstraction;

public class Car extends Vehicle {
    private int passengers;

    public Car(int passengers, int wheels, int axles, int mpg) {
        super(wheels, axles, mpg);
        this.passengers = passengers;
    }
}