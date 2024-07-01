package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamNumbersList {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        numbers.forEach(number -> System.out.println(number));

        numbers.stream().sorted().forEach(number -> System.out.println(number));

        int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
    }
}
