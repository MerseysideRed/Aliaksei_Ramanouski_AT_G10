package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamCarsRunner {

    public static void main(String[] args) {
        List<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                .distinct().filter(car -> car.contains("и"))
                .skip(1)
                .map(car -> car.toUpperCase())
                .toList();

        cars.stream().forEach(car -> System.out.println(car));
    }
}
