package Encapsulation;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, Byte age, Integer ssn, double salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak() {
        return String.format("%s %s %.2f", getFirstName(), getLastName(), this.salary);
    }
}