
import Composition.Table;
import Inheritance.Cat;

public class Main {
    public static void main(String[] args) {

        // Inheritance
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());

        // Composition
        var myTable = new Table(4, 20, 15);
        System.out.println(myTable);
    }
}