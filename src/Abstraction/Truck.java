package Abstraction;

public class Truck extends Vehicle {
    private int storageSpace;

    public Truck(int storageSpace, int wheels, int axles, int mpg) {
        super(wheels, axles, mpg);
        this.storageSpace = storageSpace;
    }
}