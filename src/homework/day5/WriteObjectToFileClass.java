package homework.day5;

import homework.day3.playground.essence.Matter;
import homework.day3.playground.essence.creatures.Crocodile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFileClass {
    public static void main(String[] args) {
        Crocodile croc = new Crocodile(12,"Croc");
        WriteObjectToFileClass writeObjectToFileClass = new WriteObjectToFileClass();
        writeObjectToFileClass.writeObjectToFile(croc, "hometaskWrittenObject.txt");
    }

    public void writeObjectToFile(Matter object, String filename) {

        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
