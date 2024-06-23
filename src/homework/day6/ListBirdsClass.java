package homework.day6;

import java.util.Arrays;
import java.util.List;

public class ListBirdsClass {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int counter = 0;
        for (String bird : birds) {
            int vowelsCounter = 0;
            String[] chars = bird.split("");

            for (String character : chars) {
                if (character.matches("[AEIOUaeiou�Ũ����������������]")) {
                    vowelsCounter++;
                }
            }

            if (vowelsCounter > 1) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.set(3, "������");
        System.out.println();

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
