package homework.day3.playground.essence.creatures;

import homework.day3.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }
}
