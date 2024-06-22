package classwork.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySecondArrayList {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList1.add("");
        }

        System.out.println("Array list" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList2.add("");
        }

        System.out.println("Linked list" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList1.get(i);
        }

        System.out.println("Array list" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            myList2.get(i);
        }

        System.out.println("Linked list" + (System.currentTimeMillis() - time));
    }
}
