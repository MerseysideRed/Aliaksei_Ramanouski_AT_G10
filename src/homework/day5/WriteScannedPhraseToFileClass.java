package homework.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteScannedPhraseToFileClass {
    public static void main(String[] args) {
        WriteScannedPhraseToFileClass writeScannedPhraseToFileClass = new WriteScannedPhraseToFileClass();
        writeScannedPhraseToFileClass.writeScannedPhraseToFile();
    }

    public void writeScannedPhraseToFile() {

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter out = new BufferedWriter(new FileWriter("hometask.txt"));) {
            out.write("Hello, I just got " + sc.nextLine() + " from you!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
