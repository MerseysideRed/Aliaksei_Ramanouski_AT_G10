package homework.day3.playground.essence.creatures;

import homework.day3.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected String name;

    public Plant(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public Plant(int mass) {
        super(mass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
