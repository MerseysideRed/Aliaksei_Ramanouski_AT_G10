package homework.day8;

import homework.day6.SeparatedPOJOClasses.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWaterRunner {

    public static void main(String[] args) {
        Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"), new Water("Синяя", "Мятный"))
                .filter(water -> !water.getColor().equalsIgnoreCase("прозрачная"))
                .sorted((water1, water2) -> water2.getSmell().compareTo(water1.getSmell()))
                .map(water -> water.getSmell().replace("ы", "ыы"))
                .collect(Collectors.collectingAndThen(Collectors.joining(), string -> {
                    System.out.println(string.length());
                    return string.length();
                }));
    }
}
