package homework.day8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamBirdsRunner {

    public static void main(String[] args) {
        Arrays.stream(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля")
                        .stream()
                        .map(bird -> bird.replace('о', 'а'))
                        .map(bird -> bird.toLowerCase())
                        .map(bird -> bird.replace("ь", ""))
                        .collect(Collectors.joining())
                        .split("б"))
                        .forEach(bird -> System.out.println(bird));
    }
}
