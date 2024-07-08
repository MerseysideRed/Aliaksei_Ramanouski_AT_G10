package homework.day8;

import homework.day6.SeparatedPOJOClasses.Bubble;
import homework.day6.SeparatedPOJOClasses.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.stream.Stream;

public class StreamFurnitureRunner {

    public static void main(String[] args) {
        Random random = new Random();

        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45))
                .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                .sorted((chair1, chair2) -> {
                    int resultOfHeightComparing = Integer.compare(chair1.getHeight(), chair2.getHeight());
                    if (resultOfHeightComparing == 0) {
                        return Integer.compare(chair2.getWidth(), chair1.getWidth());
                    } else {
                        return resultOfHeightComparing;
                    }
                })
                .flatMap(chair -> Stream.of(new Chair(chair.getHeight() / 2, chair.getWidth() * random.nextInt(3, 9))))
                .mapToInt(chair -> chair.getHeight() * chair.getWidth())
                .distinct()
                .max()
                .stream().mapToObj(maxValue -> {
                    String[] digitsOfMaxValue = String.valueOf(maxValue).split("");
                    StringBuilder maxValueStringBuilder = new StringBuilder();
                    for (String digit : digitsOfMaxValue) {
                        switch (digit) {
                            case "0" -> maxValueStringBuilder.append("zero ");
                            case "1" -> maxValueStringBuilder.append("one ");
                            case "2" -> maxValueStringBuilder.append("two ");
                            case "3" -> maxValueStringBuilder.append("three ");
                            case "4" -> maxValueStringBuilder.append("four ");
                            case "5" -> maxValueStringBuilder.append("five ");
                            case "6" -> maxValueStringBuilder.append("six ");
                            case "7" -> maxValueStringBuilder.append("seven ");
                            case "8" -> maxValueStringBuilder.append("eight ");
                            case "9" -> maxValueStringBuilder.append("nine ");
                            default -> throw new IllegalStateException("Unexpected value: ");
                        }
                    }
                    String maxValueString = maxValueStringBuilder.toString();
                    return new Bubble(maxValue, maxValueString);
                })
                .forEach(bubble -> {
                    try (BufferedWriter out = new BufferedWriter(new FileWriter("newFileStreamFurniture.txt"));) {
                        out.write(bubble.toString());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
