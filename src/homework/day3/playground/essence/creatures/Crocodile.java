package homework.day3.playground.essence.creatures;

import java.io.Serializable;

public class Crocodile extends Vertebrata implements Crawlable, Serializable {
    private static final long serialVersionUID = 7750988774191582327L;

    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public Crocodile() {
        super(0, "Unknown");
    }

     @Override
    public String toString() {
        return "Crocodile{" +
                "name=" + name +
                " " +
                "mass=" + mass +
                '}';
    }

}
