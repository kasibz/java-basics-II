package Composition;

import java.util.ArrayList;

public class Table {

    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs, Integer width, Integer length) {
        this.width = width;
        this.length = length;
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public String toString() {
        int area = this.width * this.length;
        String result = String.format("There are %d legs. The table is %d sq. units large", this.legs.size(), area);
        return result;
    }
}