package homework.day1.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(123456789);
        trainMethodsPrimitive.printLong(1234567890123456789L);
        trainMethodsPrimitive.printChar('A');
        trainMethodsPrimitive.printFloat(123.45f);
        trainMethodsPrimitive.printDouble(123456.789);
        trainMethodsPrimitive.printShort((short) -32767);
        trainMethodsPrimitive.printByte((byte) 42);
        trainMethodsPrimitive.printBoolean(true);
    }
}
