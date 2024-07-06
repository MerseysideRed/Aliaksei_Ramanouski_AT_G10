package homework.day8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamElementsRunner {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);

        List<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                .flatMap(element -> Arrays.stream(element.split("[ -]")))
                .map(element -> {
                    int currentIndex = atomicInteger.getAndIncrement();
                    if (currentIndex % 2 == 0) {
                        return String.valueOf(element.length());
                    } else {
                        return element.replace('e', 'o');
                    }
                })
                .distinct()
                .toList();

        elements.forEach(element -> System.out.println(element));
    }
}
