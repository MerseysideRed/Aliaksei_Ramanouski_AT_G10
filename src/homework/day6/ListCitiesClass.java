package homework.day6;

import java.util.ArrayList;
import java.util.List;

public class ListCitiesClass {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int counter = 0;
        for (String city : cities) {
            char[] chars = city.toCharArray();
            for (char character : chars) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
