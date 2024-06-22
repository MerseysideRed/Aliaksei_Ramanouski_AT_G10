package homework.day5;

import java.io.*;

public class CountAllCharactersInFileAndWriteToNewFile {
    public static void main(String[] args) {
        CountAllCharactersInFileAndWriteToNewFile countAllCharactersInFileAndWriteToNewFile = new CountAllCharactersInFileAndWriteToNewFile();
        countAllCharactersInFileAndWriteToNewFile.countAllCharactersInFileAndWriteToNewFile("hometask.txt", "hometaskOutputCount.tex");
    }

    public void countAllCharactersInFileAndWriteToNewFile(String filename1, String filename2) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(filename1))) {
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

        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename2))) {
            out.write("Количество символов: " + counter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
