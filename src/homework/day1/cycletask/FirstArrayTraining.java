package cycletask;

import java.util.Random;

public class FirstArrayTraining {

    int[] array = new int[7];

    public void fillFirstArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
        }
    }

    public void printFirstArray() {
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    public void printReverseFirstArray() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public void multipleByFiveFirsArray() {
        for (int j : array) {
            System.out.print(j * 5 + " ");
        }

        System.out.println();
    }

    public void squareFirstArray() {
        for (int j : array) {
            System.out.print((j * j) + " ");
        }

        System.out.println();
    }

    public void findMinValueFirstArray() {
        Integer min = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        System.out.println(min);
    }

    public void replaceFirstAndLastElements() {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            temp = array[0];
        }

        for (int i = 0; i < array.length; i++) {
            array[0] = array[array.length - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[array.length - 1] = temp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    public void sortDescendingFirstArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
