package homework.day5;

import homework.day3.playground.essence.creatures.Crocodile;


import java.io.*;

public class ReadAndRewriteObjectToNewFileClass {
    public static void main(String[] args) {
        ReadAndRewriteObjectToNewFileClass readAndRewriteObjectToNewFileClass = new ReadAndRewriteObjectToNewFileClass();
        readAndRewriteObjectToNewFileClass.readAndRewriteObjectToNewFile("hometaskWrittenObject.txt", "hometaskRewrittenObject.txt");
    }

    public void readAndRewriteObjectToNewFile(String filename1, String filename2) {

        try (FileInputStream fis = new FileInputStream(filename1);
             ObjectInputStream ois = new ObjectInputStream(fis);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename2))) {

            Object obj = ois.readObject();

            if (obj instanceof Crocodile) {
                Crocodile croc = (Crocodile) obj;
            } else {
                System.out.println("The file does not contain a Crocodile object.");
            }

            writer.write(obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

