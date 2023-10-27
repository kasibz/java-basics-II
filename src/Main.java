
import Composition.Table;
import Inheritance.Cat;
import Encapsulation.Employee;
import java.util.ArrayList;
import Polymorphism.*;

public class Main {
    public static void main(String[] args) {

        // Inheritance
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());

        // Composition
        var myTable = new Table(4, 20, 15);
        System.out.println(myTable);

        // Abstraction

        // Encapsulation
        var myEmployee = new Employee("Kasib", "Abdullah", (byte) 31, 123456789, 25555.98);
        System.out.println(myEmployee.speak());

        // Polymorphism
        var colors = new ArrayList<Color>();
        colors.add(new Red());
        colors.add(new Blue());
        colors.add(new Yellow());

        for (Color color : colors) {
            System.out.println(color.revealColor());
        }

    }
}