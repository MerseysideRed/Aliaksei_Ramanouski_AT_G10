package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamCarsRunner {

    public static void main(String[] args) {
        List<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").toList();

        cars = cars.stream().distinct().toList();

        cars = cars.stream().filter(car -> car.contains("и")).toList();

        cars = cars.stream().skip(1).toList();

        cars = cars.stream().map(car -> car.toUpperCase()).toList();

        cars.stream().forEach(car -> System.out.println(car));
    }
}
