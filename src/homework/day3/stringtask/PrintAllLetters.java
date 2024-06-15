package homework.day3.stringtask;

public class PrintAllLetters {
    public static void printAllLetters(String string) {
        char[] charsArray = string.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {
            System.out.println(charsArray[i]);
        }
    }
}
