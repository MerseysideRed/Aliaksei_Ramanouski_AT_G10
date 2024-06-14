package homework.day3.playground.essence.craft;

public interface Transportable {
    default int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", this.getClass().getSimpleName(), getName(), pointA, pointB);

        return pointB - pointA;
    }

    String getName();
}
