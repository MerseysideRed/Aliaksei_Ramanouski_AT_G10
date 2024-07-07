package homework.day8;

import java.util.stream.Stream;

public class StreamCarsRunner {

    public static void main(String[] args) {
        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                .distinct().filter(car -> car.contains("и"))
                .skip(1)
                .map(car -> car.toUpperCase())
                .forEach(car -> System.out.println(car));
    }
}
