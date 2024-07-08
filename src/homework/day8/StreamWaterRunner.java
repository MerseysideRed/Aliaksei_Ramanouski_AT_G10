package homework.day8;

import homework.day6.SeparatedPOJOClasses.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWaterRunner {

    public static void main(String[] args) {
        Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"), new Water("Синяя", "Мятный"))
                .filter(water -> !water.getColor().equalsIgnoreCase("прозрачная"))
                .sorted((water1, water2) -> water2.getSmell().compareTo(water1.getSmell()))
                .flatMap(water -> {
                    String modifiedSmell = water.getSmell().replace("ы", "ыы");
                    return Stream.of(new Water(water.getColor(), modifiedSmell));
                })
                .map(water -> water.getSmell())
                .collect(Collectors.collectingAndThen(Collectors.joining(), string -> {
                    System.out.println(string.length());
                    return string.length();
                }));
    }
}
