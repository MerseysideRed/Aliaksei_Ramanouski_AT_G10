package homework.day7;

import homework.day7.SeparatedPOJOClasses.Cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCarsClass {
    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>();

        cars.add(new Cars("Toyota", "Corolla"));
        cars.add(new Cars("Ford", "Mustang"));
        cars.add(new Cars("BMW", "X5"));

        for (Cars car : cars) {
            System.out.println(car.getBrand() + ":" + car.getModel());
        }

        Map<String, Cars> carsMap = new HashMap<>();

        for (Cars car : cars) {
            carsMap.put(car.getBrand(), car);
        }

        for (String key : carsMap.keySet()) {
            System.out.print((key + " "));
        }
        System.out.println();

        for (Cars value : carsMap.values()) {
            System.out.print((value + " "));
        }
        System.out.println();

        for (Map.Entry<String, Cars> entry : carsMap.entrySet()) {
            System.out.print((entry + " "));
        }
        System.out.println();
    }
}
