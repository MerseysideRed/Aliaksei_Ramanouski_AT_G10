package homework.day3.playground.essence.craft.hand;

import homework.day3.playground.essence.Matter;

public abstract class Container extends Matter {
    protected String name;

    public Container(int mass, String name) {
        super(mass);
        this.name = name;
    }
}
