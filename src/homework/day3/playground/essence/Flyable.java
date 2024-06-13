package homework.day3.playground.essence;

public interface Flyable {
    default void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s\n", this.getClass().getSimpleName(), getName(), direction);
    }

    String getName();
}
