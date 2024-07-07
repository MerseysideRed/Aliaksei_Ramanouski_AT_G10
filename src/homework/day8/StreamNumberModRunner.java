package homework.day8;

import java.util.stream.Stream;

public class StreamNumberModRunner {

    public static void main(String[] args) {
        Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                .filter(number -> String.valueOf(number).contains("3"))
                .flatMap(number -> Stream.of(String.valueOf(number).split("")))
                .map(numberString -> switch (numberString) {
                    case "0" -> "zero";
                    case "1" -> "one";
                    case "2" -> "two";
                    case "3" -> "three";
                    case "4" -> "four";
                    case "5" -> "five";
                    case "6" -> "six";
                    case "7" -> "seven";
                    case "8" -> "eight";
                    case "9" -> "nine";
                    default -> throw new IllegalStateException("Unexpected value: " + numberString);
                })
                .distinct()
                .sorted((number1, number2) -> number2.compareTo(number1))
                .forEach(number -> System.out.println(number));
    }
}
