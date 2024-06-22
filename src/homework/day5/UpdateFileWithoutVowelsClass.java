package homework.day5;

import java.io.*;

public class UpdateFileWithoutVowelsClass {
    public static void main(String[] args) {
        UpdateFileWithoutVowelsClass updateFileWithoutVowelsClass = new UpdateFileWithoutVowelsClass();
        updateFileWithoutVowelsClass.updateFileWithoutVowels("hometask.txt");
    }

    public void updateFileWithoutVowels(String filename) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {

            String line;
            while (((line = in.readLine()) != null)) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String textWithoutVowels = stringBuilder.toString().replaceAll("[AEIOUaeiouАЕЁИОУЫЭЮЯаеёиоуыэюя]", "");

        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename))) {
            out.write(textWithoutVowels);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
