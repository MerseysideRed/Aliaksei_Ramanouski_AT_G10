package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamCountriesRunner {

    public static void main(String[] args) {
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия").toList();

        String vowels = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
        countries = countries.stream().filter(country -> vowels.chars().anyMatch(vowel -> country.contains(Character.toString(vowel)))).toList();

        countries = countries.stream().filter(country -> country.length() < 7).toList();

        countries = countries.stream().map(country -> country.toUpperCase()).toList();

        countries = countries.stream().map(country -> "\"" + country + "\"").toList();

        countries.stream().forEach(country -> System.out.println(country));
    }
}
