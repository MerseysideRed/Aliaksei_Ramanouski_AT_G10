package homework.day6;

import homework.day6.SeparatedPOJOClasses.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSandClass {
    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();

        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandsMap = new HashMap<>();

        int key = 0;
        for (Sand sand : sands) {
            sandsMap.put(key++, sand);
        }
        System.out.println();

        for (Integer keyMap : sandsMap.keySet()) {
            System.out.print(keyMap + " ");
        }
        System.out.println();

        for (Sand sand : sandsMap.values()) {
            System.out.print(sand + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandsMap.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();
    }
}
