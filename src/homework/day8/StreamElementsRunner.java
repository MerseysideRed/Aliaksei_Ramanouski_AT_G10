package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamElementsRunner {

    public static void main(String[] args) {
        List<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb").toList();

        List<String> finalElements = elements;
        elements = elements.stream().flatMap(element -> {
            String[] words = finalElements.toArray(new String[0]);
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0) {
                    words[i] = String.valueOf(words[i].length());
                } else {
                    words[i] = words[i].replace('e', 'o');
                }
            }
            return Stream.of(String.join(" ", words));
        }).toList();

        elements = elements.stream().distinct().toList();

        elements.forEach(element -> System.out.println(element));
    }
}
