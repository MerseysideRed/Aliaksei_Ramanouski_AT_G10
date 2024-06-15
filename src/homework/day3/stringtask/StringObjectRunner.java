package homework.day3.stringtask;

public class StringObjectRunner {
    public static void main(String[] args) {
        PrintAllLetters printAllLetters = new PrintAllLetters();
        printAllLetters.printAllLetters("This is the way");

        PrintAllFiguresInString printAllFiguresInString = new PrintAllFiguresInString();
        printAllFiguresInString.printAllFiguresInString("я подтягиваюсь 10 раз, а может и все 12");

        System.out.println();

        PrintAllDuplicates printAllDuplicates = new PrintAllDuplicates();
        printAllDuplicates.printAllDuplicates("It is test, the test is passed");

        LogEditor logEditor2 = new LogEditor();
        logEditor2.editLog("""
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """);

        CurrentDateFormat currentDateFormat = new CurrentDateFormat();
        currentDateFormat.printCurrentDateTime();
    }
}
