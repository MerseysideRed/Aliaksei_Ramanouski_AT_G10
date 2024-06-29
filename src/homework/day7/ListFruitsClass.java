package homework.day7;

import homework.day7.SeparatedPOJOClasses.Fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListFruitsClass {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();

        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }
        System.out.println();

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }
        System.out.println();

        Map<Integer, Fruits> fruitsMap = new HashMap<>();

        int key = 1;
        for (Fruits fruit : fruits) {
            fruitsMap.put(key++, fruit);
        }

        for (Integer keys : fruitsMap.keySet()) {
            System.out.print(keys + " ");
        }
        System.out.println();

        for (Fruits fruit : fruitsMap.values()) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Fruits> entry : fruitsMap.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();
    }
}
