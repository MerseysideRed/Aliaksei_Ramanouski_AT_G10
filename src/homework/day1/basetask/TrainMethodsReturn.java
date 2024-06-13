package homework.day1.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int intNumberExample) {
        return intNumberExample * 3;
    }

    public long returnNewLong(long longNumberExample) {
        return longNumberExample - 4;
    }

    public String returnNewChar(char charExample) {
        return charExample + " " + charExample;
    }

    public float returnNewFloat(float floatNumberExample) {
        return floatNumberExample / 2;
    }

    public double returnNewDouble(double doubleNumberExample) {
        return doubleNumberExample + 8;
    }

    public short returnNewShort(short shortNumberExample) {
        return (short) (shortNumberExample - 1);
    }

    public byte returnNewByte(byte byteNumberExample) {
        return (byte) (byteNumberExample * 2);
    }

    public boolean returnNewBoolean(boolean booleanExample) {
        return !booleanExample;
    }
}
