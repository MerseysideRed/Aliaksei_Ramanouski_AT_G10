package homework.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamButterfliesRunner {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();

        butterflies.addAll(Stream.of("Common blue", "Swallowtail", "Aglais io", "Common blue").toList());

        butterflies = butterflies.stream().map(butterfly -> "\"" + butterfly + "\"").toList();

        butterflies = butterflies.stream().filter(butterfly -> butterfly.contains("a") && butterfly.contains("o")).toList();

        butterflies.forEach(butterfly -> System.out.println(butterfly));
    }
}
