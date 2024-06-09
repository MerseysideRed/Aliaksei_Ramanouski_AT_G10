package homework.day2;

import java.util.Arrays;

public class ArrayTraining {
    public static void main(String[] args) {
        int[] newArray = {2,4,5,3,1,6};
        ArrayTraining arrayTraining = new ArrayTraining();
        System.out.println(arrayTraining.sumNElementsArray(newArray, 3));
        System.out.println(Arrays.toString(arrayTraining.returnReverseArrayLargerN(newArray, 3)));
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
}
