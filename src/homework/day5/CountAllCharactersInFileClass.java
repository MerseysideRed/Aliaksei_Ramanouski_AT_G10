package homework.day5;

import java.io.*;

public class CountAllCharactersInFileClass {
    public static void main(String[] args) {
        CountAllCharactersInFileClass countAllCharactersInFileClass = new CountAllCharactersInFileClass();
        countAllCharactersInFileClass.countAllCharactersInFile("hometask.txt");
    }

    public void countAllCharactersInFile(String filename) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line;
            while (((line = in.readLine()) != null)) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String textWithoutNewLineChars = stringBuilder.toString().replaceAll("[\\r|\\n]","");
        char[] chars = textWithoutNewLineChars.toCharArray();
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            counter++;
        }

        System.out.println(counter);
    }
}
