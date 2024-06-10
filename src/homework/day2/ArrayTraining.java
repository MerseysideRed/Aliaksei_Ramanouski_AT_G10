package homework.day2;

import java.util.Arrays;

public class ArrayTraining {
    public static void main(String[] args) {
        int[] newArray = {12, 4, 5, 3, 7, 6, 1, 8, 9, 1, 2, 1, 12, 4, 5, 3, 7, 6, 1, 8, 9, 1, 2, 1};
        ArrayTraining arrayTraining = new ArrayTraining();
        System.out.println(arrayTraining.sumNElementsArray(newArray, 3));
        System.out.println(Arrays.toString(arrayTraining.returnReverseArrayLargerN(newArray, 3)));
        System.out.println(arrayTraining.returnSumSpecificElements(newArray));
        arrayTraining.drawCow();
    }

    public int sumNElementsArray(int[] array, int n) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (counter == n) {
                sum += array[i];
                counter = 0;
            }
        }

        return sum;
    }

    public int[] returnReverseArrayLargerN(int[] array, int n) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                counter++;
            }
        }

        int[] secondArray = new int[counter];
        int newCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                secondArray[newCounter] = array[i];
                newCounter++;
            }
        }

        int[] thirdArray = new int[secondArray.length];
        int anotherCounter = 0;
        for (int i = secondArray.length - 1; i >= 0; i--) {
            thirdArray[anotherCounter] = secondArray[i];
            anotherCounter++;
        }

        return thirdArray;
    }

    public int returnSumSpecificElements(int[] array) {
        int firstNumber = 0;
        if (array.length < 10) {
            firstNumber = array.length;
        } else if (array.length < 100) {
            firstNumber = array.length / 10;
        } else if (array.length < 1000) {
            firstNumber = array.length / 100;
        } else if (array.length < 10000) {
            firstNumber = array.length / 1000;
        } else if (array.length < 100000) {
            firstNumber = array.length / 10000;
        } else if (array.length < 1000000) {
            firstNumber = array.length / 100000;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % firstNumber == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    public void drawCow() {
        System.out.println(
                """
                         ^__^
                         (oo)\\\\_______
                        (__)\\ ) \\/\\  \\
                             ||----w |\\
                             ||     ||
                """
        );
    }
}