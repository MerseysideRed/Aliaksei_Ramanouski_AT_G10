package homework.day3.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        int coordinateSelector = random.nextInt(1, 80);

        System.out.printf("CoordinatesGenerator: I have generated point with value: %d\n", coordinateSelector);

        return coordinateSelector;
    }
}
