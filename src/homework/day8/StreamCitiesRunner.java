package homework.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCitiesRunner {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.addAll(Stream.of("Минск", "Москва", "Берлин").toList());

        int lengthCounter = cities.stream().mapToInt(city -> city.length()).sum();

        System.out.println(lengthCounter);
    }
}
