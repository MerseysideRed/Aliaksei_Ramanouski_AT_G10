package homework.day3.stringtask;

public class PrintAllFiguresInString {
    public static void printAllFiguresInString(String string) {
        String[] array = string.split("");

        int figuresCounter = 0;
        String[] exampleArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < exampleArray.length; j++) {
                if (array[i].equals(exampleArray[j])) {
                    figuresCounter++;
                }
            }
        }

        String[] secondArray = new String[figuresCounter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < exampleArray.length; j++) {
                if (array[i].equals(exampleArray[j])) {
                    secondArray[index] = exampleArray[j];
                    index++;
                }
            }
        }

        int[] thirdArray = new int[secondArray.length];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = Integer.parseInt(secondArray[i]);
            System.out.print(thirdArray[i] + " ");
        }
    }
}
