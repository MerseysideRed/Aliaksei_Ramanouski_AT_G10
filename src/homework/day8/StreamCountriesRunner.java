package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamCountriesRunner {

    public static void main(String[] args) {
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия")
                .filter(country -> country.matches(".*[АЕЁИОУЫЭЮЯаеёиоуыэюя].*"))
                .filter(country -> country.length() < 7)
                .map(country -> country.toUpperCase())
                .map(country -> "\"" + country + "\"")
                .toList();

        countries.stream().forEach(country -> System.out.println(country));
    }
}
