package classwork.day2;

import java.util.*;

public class MySecondSet {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList1.add(" ");
        }

        System.out.println("HashSet " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList2.add(" ");
        }

        System.out.println("TreeSet " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (String s : myList1) {

        }

        System.out.println("TreeSet " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        for (String s : myList2) {

        }

        System.out.println("Linked list " + (System.currentTimeMillis() - time));
    }
}
