package homework.day3.stringtask;

public class PrintAllDuplicates {
    public static void printAllDuplicates(String string) {
        String[] words = string.split("\\W+");

        int duplicatesCounter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[j] != null && words[i].equalsIgnoreCase(words[j])) {
                    isDuplicate = true;
                    words[j] = null;
                }
            }

            if (isDuplicate) {
                System.out.println(words[i]);
                duplicatesCounter++;
            }
        }
        if (duplicatesCounter == 0) {
            System.out.println("There aren't duplicates in the string");
        }
    }
}
