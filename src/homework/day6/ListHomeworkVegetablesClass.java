package homework.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListHomeworkVegetablesClass {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();

        vegetables.add("�������");
        vegetables.add("������");
        vegetables.add("�������");
        vegetables.add("�����");
        vegetables.add("�������");

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        int counter = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("�")) {
                counter++;
            }
        }
        System.out.println(counter);

        vegetables.remove("������");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        String[] numbersArray = {"1","2","3"};
        List<String> numbers = Arrays.asList(numbersArray);
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        String[] stringsArray = {"������", "��� ������"};
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList,stringsArray);
        for (String string : stringList) {
            System.out.print(string + " ");
        }
        System.out.println();

        Collections.sort(vegetables);
        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        Collections.max(vegetables);
        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        Collections.shuffle(vegetables);
        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        Collections.reverse(vegetables);
        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();
    }
}
