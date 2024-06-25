package homework.day6;

import homework.day6.SeparatedPOJOClasses.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListChairsClass {
    public static void main(String[] args) {
        List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair chair : chairs) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println();

        Map<Integer, Chair> chairMap = new HashMap<>();

        int key = 0;
        for (Chair chair : chairs) {
            chairMap.put(key++, chair);
        }

        for (Integer keyMap : chairMap.keySet()) {
            System.out.print(keyMap + " ");
        }
        System.out.println();

        for (Chair chair : chairMap.values()) {
            System.out.print(chair + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.print(entry + " ");
        }
    }
}
