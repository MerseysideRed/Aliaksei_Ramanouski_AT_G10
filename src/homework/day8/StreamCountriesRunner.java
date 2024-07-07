package homework.day8;

import java.util.stream.Stream;

public class StreamCountriesRunner {

    public static void main(String[] args) {
        Stream.of("Андора", "Португалия", "Англия", "Замбия")
                .filter(country -> country.matches(".*[АЕЁИОУЫЭЮЯаеёиоуыэюя].*"))
                .filter(country -> country.length() < 7)
                .map(country -> country.toUpperCase())
                .map(country -> "\"" + country + "\"")
                .forEach(country -> System.out.println(country));
    }
}
