package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(123456789));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(1234567890123456789L));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('A'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(123.45f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(123456.789));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short)12345));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte)16));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));
    }
}
