package Course;

import java.util.Random;

public class Course {
    public static void main(String[] args) {
        Course course = new Course();
        course.foo();
    }

    public void foo() {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.print("initial array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int avg = 0;

        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        System.out.println("Average value is: " + avg);
    }
}

