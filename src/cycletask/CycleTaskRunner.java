package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileCycleTraining whileCycleTraining = new WhileCycleTraining();
        whileCycleTraining.printWhile();

        ForCycleTraining forCycleTraining = new ForCycleTraining();
        forCycleTraining.printFor();

        FirstArrayTraining firstArrayTraining = new FirstArrayTraining();
        firstArrayTraining.fillFirstArray();

        firstArrayTraining.printFirstArray();

        firstArrayTraining.printReverseFirstArray();

        firstArrayTraining.multipleByFiveFirsArray();

        firstArrayTraining.squareFirstArray();

        firstArrayTraining.findMinValueFirstArray();

        firstArrayTraining.replaceFirstAndLastElements();

        firstArrayTraining.sortDescendingFirstArray();
    }
}
