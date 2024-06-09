package homework.day2;

public class ArrayTraining {
    public static void main(String[] args) {
        int[] newArray = {2,4,5,3,1,6};
        ArrayTraining arrayTraining = new ArrayTraining();
        System.out.println(arrayTraining.sumNElementsArray(newArray, 3));
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
}
