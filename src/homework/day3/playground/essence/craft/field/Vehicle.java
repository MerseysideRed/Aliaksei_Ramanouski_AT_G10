package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }
}
