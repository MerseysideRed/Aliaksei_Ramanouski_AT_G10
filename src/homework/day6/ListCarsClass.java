package homework.day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCarsClass {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(List.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        for (String car : cars) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt", true))) {
                writer.write("\"" + car + "\"" + "\n");
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            int counter = 0;

            char[] chars = car.toCharArray();
            for (char character : chars) {
                counter++;
            }

            if (counter > 4) {
                iterator.remove();
            }
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
