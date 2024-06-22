package classwork.day2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyFirstMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        String[] words = "мама мыла раму".split("");

        for (int i = 0; i < words.length; i++) {
            myMap.put(i, words[i]);
        }

        Set<Integer> keys = myMap.keySet();

        for (Integer key : keys) {
            System.out.print(key + " ");
        }

        System.out.println();

        Collection<String> values = myMap.values();

        for (String value : values) {
            System.out.print(value + " ");
        }

    }
}
