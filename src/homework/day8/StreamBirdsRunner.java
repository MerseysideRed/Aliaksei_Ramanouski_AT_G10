package homework.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBirdsRunner {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        birds = birds.stream().map(bird -> bird.replace('о', 'a')).toList();

        String newBirds = birds.stream().map(bird -> bird.toLowerCase()).collect(Collectors.joining());

        birds = Arrays.stream(newBirds.split("б")).toList();

        birds.stream().forEach(bird -> System.out.println(bird));
    }
}
