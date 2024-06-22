package classwork.day2;

import java.util.ArrayList;
import java.util.List;

public class MyFirstArrayList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String[] words = "мама мыла раму".split("");

        for (int i = 0; i < words.length; i++) {
            myList.add(words[i]);
        }

        for (String e : myList) {
            System.out.print(e + " ");
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
        }
    }
}
