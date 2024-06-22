package homework.day3.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {

    public Crocodile(int mass, String name) {
        super(mass, name);
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
