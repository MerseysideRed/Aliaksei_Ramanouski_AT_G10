package homework.day3.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        int familyMembersCounter = home.getMass() / mass;

        if (mass < home.getMass()) {
            System.out.printf("I am %s and I will nest there with %d my family members!", name, familyMembersCounter);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
