package homework.day6;

import java.util.Arrays;
import java.util.List;

public class ListDoublesClass {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double oneDouble : doubles) {
            System.out.print(oneDouble + " ");
        }
        System.out.println();

        Double multiplication = 1.0;
        for (Double oneDouble : doubles) {
            multiplication *= oneDouble;
        }
        System.out.println(multiplication);

        Double fractionalPartsSum = 0.0;
        for (Double oneDouble : doubles) {
            Double fractionalPart = oneDouble - Math.floor(oneDouble);
            fractionalPartsSum += fractionalPart;
        }
        System.out.println(fractionalPartsSum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(Math.floor(doubles.get(i)) + " ");
        }
    }
}
