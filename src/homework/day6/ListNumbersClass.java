package homework.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListNumbersClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        Collections.reverse(numbers);
        System.out.println();

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
