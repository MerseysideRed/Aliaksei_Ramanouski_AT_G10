package homework.day7;

import homework.day7.SeparatedPOJOClasses.Cities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCitiesClass {
    public static void main(String[] args) {
        List<Cities> cities = new ArrayList<>();

        cities.add(new Cities("Москва", 12000000));
        cities.add(new Cities("Нью-Йорк", 8400000));
        cities.add(new Cities("Париж", 2200000));

        for (Cities city : cities) {
            System.out.print(city.getName() + " ");
        }
        System.out.println();

        for (Cities city : cities) {
            System.out.print(city.getPopulation() + " ");
        }
        System.out.println();

        Map<String, Cities> citiesMap = new HashMap<>();

        for (Cities city : cities) {
            citiesMap.put(city.getName(), city);
        }

        int commonPopulation = 0;
        for (Cities city : citiesMap.values()) {
            commonPopulation += city.getPopulation();
        }
        System.out.println(commonPopulation);
    }
}
