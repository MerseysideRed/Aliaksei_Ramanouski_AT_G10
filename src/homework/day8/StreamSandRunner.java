package homework.day8;

import homework.day6.SeparatedPOJOClasses.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSandRunner {

    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();

        sands.addAll(Arrays.asList(new Sand(12, "Речной"), new Sand(12, "Речной"), new Sand(12, "Речной"), new Sand(12, "Речной"), new Sand(12, "Речной")));

        try {
            sands.stream()
                    .filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                    .sorted((sand1, sand2) -> Integer.compare(sand1.getWeight(), sand2.getWeight()))
                    .flatMap(sand -> Stream.of(new Sand(sand.getWeight() * 2, sand.getName().toUpperCase())))
                    .collect(Collectors.toMap(sand -> sand.getWeight(), sand -> sand.getName()))
                    .forEach((weight, name) -> {
                        try (BufferedWriter out = new BufferedWriter(new FileWriter("newFileStreamSand.txt"));) {
                            out.write(weight + " : " + name);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IllegalStateException e) {
            System.out.println("We have IllegalStateException because we tried to create a Map with duplicate keys. Keys must be unique.");
        }
    }
}
