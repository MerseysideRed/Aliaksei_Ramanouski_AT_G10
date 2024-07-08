package homework.day8;

import homework.day6.SeparatedPOJOClasses.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDoublesRunner {

    public static void main(String[] args) {
        Random random = new Random();

        double totalVolume = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
                .mapToInt(elementDouble -> (int) Math.round(elementDouble))
                .flatMap(elementInt -> IntStream.generate(() -> random.nextInt(elementInt + 1)).limit(elementInt))
                .distinct()
                .boxed()
                .flatMap(elementInteger -> IntStream.range(0, elementInteger).mapToObj(i -> new Bubble(elementInteger, "Bubble vol-" + i)))
                .peek(bubble -> System.out.println(bubble))
                .mapToDouble(bubble -> bubble.getVolume())
                .sum();

        System.out.println(totalVolume);
    }
}
