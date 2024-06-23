package homework.day6;

import java.util.ArrayList;
import java.util.List;

public class ListNoodlesClass {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.println("- " + noodle);
        }

        for (int i = 0; i < noodles.size(); i++) {
            String noodle = noodles.get(i);
            noodle = noodle.replace('a', 'o');
            noodles.set(i, noodle);
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
