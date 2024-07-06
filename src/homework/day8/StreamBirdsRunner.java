package homework.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBirdsRunner {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        birds = Arrays.stream(birds.stream()
                        .map(bird -> bird.replace('о', 'а'))
                        .map(bird -> bird.toLowerCase())
                        .map(bird -> bird.replace("ь", ""))
                        .collect(Collectors.joining())
                        .split("б"))
                .toList();

        birds.forEach(bird -> System.out.println(bird));
    }
}
