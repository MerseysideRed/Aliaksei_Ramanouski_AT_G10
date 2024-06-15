package homework.day3.stringtask;

public class StringStaticRunner {
    public static void main(String[] args) {
        CurrentDateFormat.printCurrentDateTime();
        LogEditor.editLog("""
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """);
        PrintAllFiguresInString.printAllFiguresInString("я подтягиваюсь 10 раз, а может и все 12");
        PrintAllDuplicates.printAllDuplicates("It is test, the test is passed");
        PrintAllLetters.printAllLetters("This is the way");
    }
}
