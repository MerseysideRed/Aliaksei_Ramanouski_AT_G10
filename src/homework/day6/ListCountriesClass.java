package homework.day6;

import java.util.ArrayList;
import java.util.List;

public class ListCountriesClass {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            if (country.equals(countries.getLast())) {
                System.out.println(country);
            } else {
                System.out.print(country + ", ");
            }
        }

        int counter = 0;
        for (String country : countries) {
            int countChars = 0;
            char[] chars = country.toCharArray();

            for (char character : chars) {
                countChars++;
            }

            if (countChars < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
