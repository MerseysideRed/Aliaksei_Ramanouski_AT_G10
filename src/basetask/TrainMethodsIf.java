package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int intNumberExample) {
        if (intNumberExample < 8) {
            return intNumberExample * 7;
        } else {
            return intNumberExample / 4;
        }
    }

    public long returnNewLong(long longNumberExample) {
        if (longNumberExample > 300) {
            return longNumberExample - 300;
        } else {
            return longNumberExample + 20;
        }
    }

    public String returnNewChar(char charExample) {
        if (charExample == 'g') {
            return "go";
        } else {
            return "o" + charExample;
        }
    }

    public float returnNewFloat(float floatNumberExample) {
        if (floatNumberExample == 0.67) {
            return floatNumberExample;
        } else {
            return floatNumberExample * 2;
        }
    }

    public double returnNewDouble(double doubleNumberExample) {
        if (doubleNumberExample > 30 && doubleNumberExample < 80) {
            return doubleNumberExample + 87;
        } else if (doubleNumberExample > 80 && doubleNumberExample < 400) {
            return doubleNumberExample - 87;
        } else if (doubleNumberExample > 400) {
            return doubleNumberExample / 4;
        } else {
            return doubleNumberExample;
        }
    }

    public void returnNewBoolean(boolean booleanExample) {
        if (booleanExample) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}

