package homework.day8;

import homework.day6.SeparatedPOJOClasses.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBubblesRunner {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        int totalVolumeOfNewBubbles = bubbles.stream()
                .filter(bubble -> bubble.getVolume() > 3)
                .sorted(Comparator.comparing(bubble -> bubble.getName()))
                .flatMap(bubble -> Stream.of(new Bubble(bubble.getVolume() * 3, bubble.getName())))
                .mapToInt(bubble -> bubble.getVolume())
                .sum();

        System.out.println(totalVolumeOfNewBubbles);
    }
}
