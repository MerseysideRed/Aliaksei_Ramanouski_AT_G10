package homework.day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ListFiguresClass {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        for (String figure : figures) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("figures.txt", true))) {
                writer.write("- " + figure + "\n");
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        int counter = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        try {
            figures.add(3, "Треугольник");
        } catch (UnsupportedOperationException e) {
            System.out.println("Получаем UnsupportedOperationException, потому что наш список figures создан через Collection.asList, который возвращает фиксированный по размеру список и не поддерживает метод add()");
        }

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.println();
    }
}
