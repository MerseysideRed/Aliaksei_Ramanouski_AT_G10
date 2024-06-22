package homework.day5;

import java.util.Scanner;

public class WriteScannedPhraseToConsoleClass {
    public static void main(String[] args) {
        WriteScannedPhraseToConsoleClass writeScannedPhraseToConsoleClass = new WriteScannedPhraseToConsoleClass();
        writeScannedPhraseToConsoleClass.writeScannedPhraseToConsole();
    }

    public void writeScannedPhraseToConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, I just got " + sc.nextLine() + " from you!");
    }
}
