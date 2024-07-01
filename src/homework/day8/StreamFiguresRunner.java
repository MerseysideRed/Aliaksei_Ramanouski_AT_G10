package homework.day8;

import java.util.List;
import java.util.stream.Stream;

public class StreamFiguresRunner {

    public static void main(String[] args) {
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").toList();

        List<Integer> figures2 = figures.stream().map(figure -> figure.length()).toList();

        figures2 = figures2.stream().filter(figure -> (figure > 4)).toList();

        figures2.stream().forEach(figure -> System.out.println(figure));
    }
}
