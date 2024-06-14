package homework.day3.playground.processors;

import homework.day3.playground.essence.craft.Transportable;
import homework.day3.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int finalDestination = transportable.move(pointA, pointB);

        System.out.printf("Transportable %s was moved to %d points\n", transportable.getName(), finalDestination);
        System.out.println();
    }

    public void runTransportable(Transportable transportable) {
        int finalDestination = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());

        System.out.printf("Transportable %s was moved to %d points\n", transportable.getName(), finalDestination);
        System.out.println();
    }
}
