package classwork.day1.course;

import java.util.Scanner;

public class ClassworkDay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();

            System.out.printf("Just got '%s' text!", incoming);

            if (incoming.equalsIgnoreCase("stop")) {
                return;
            }
        }
    }
}
