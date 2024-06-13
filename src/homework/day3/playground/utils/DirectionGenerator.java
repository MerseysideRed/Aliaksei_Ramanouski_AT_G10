package homework.day3.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random = new Random();
        int directionSelector = random.nextInt(1, 40);

        if (directionSelector >= 1 && directionSelector <= 9) {
            return "NORTH";
        } else if (directionSelector >= 10 && directionSelector <= 19) {
            return "SOUTH";
        } else if (directionSelector >= 20 && directionSelector <= 29) {
            return "WEST";
        } else if (directionSelector >= 30 && directionSelector <= 39) {
            return "EAST";
        }

        return "";
    }
}
