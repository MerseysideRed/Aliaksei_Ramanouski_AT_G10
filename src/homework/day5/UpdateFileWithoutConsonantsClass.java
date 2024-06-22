package homework.day5;

import java.io.*;

public class UpdateFileWithoutConsonantsClass {
    public static void main(String[] args) {
        UpdateFileWithoutConsonantsClass updateFileWithoutConsonantsClass = new UpdateFileWithoutConsonantsClass();
        updateFileWithoutConsonantsClass.updateFileWithoutConsonants("hometask.txt");
    }

    public void updateFileWithoutConsonants(String filename) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line;
            while (((line = in.readLine()) != null)) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String textWithoutConsonants = stringBuilder.toString().replaceAll("[бвгджзйклмнпрстфхцчшщBCDFGHJKLMNPQRSTVWXYZбвгджзйклмнпрстфхцчшщBCDFGHJKLMNPQRSTVWXYZ]", "");

        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename, true))) {
            out.newLine();
            out.write(textWithoutConsonants);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
