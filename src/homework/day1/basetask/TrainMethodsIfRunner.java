package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(11));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(270));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('B'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(1.5f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(27.3));
        trainMethodsIf.returnNewBoolean(false);
    }
}
