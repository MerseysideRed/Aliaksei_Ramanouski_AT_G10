package homework.day3.playground.essence.material;

import homework.day3.playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {
    public Petrol(int mass) {
        super(mass);
    }
}
