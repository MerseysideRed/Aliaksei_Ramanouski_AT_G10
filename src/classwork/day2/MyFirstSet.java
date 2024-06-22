package classwork.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyFirstSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] words = "мама мыла раму".split("");

        for (int i = 0; i < words.length; i++) {
            mySet.add(words[i]);
        }

        for (String e : mySet) {
            System.out.print(e);
        }

        System.out.println();

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}

