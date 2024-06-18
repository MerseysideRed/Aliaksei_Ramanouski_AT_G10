package homework.day4;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X argument) {
        return "I received 1 argument of type: " + argument.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X argument1, Y argument2) {
        return "I received 2 arguments of type: " + argument1.getClass().getSimpleName() + " class, " + argument2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X argument, String s) {
        int symbolsCounter = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            symbolsCounter++;
        }

        System.out.println("I got an object of " + argument.getClass().getSimpleName() + " class and string with " + symbolsCounter + " characters");
    }

    public void genericMethodHalfGenArgs(X argument1, Y argument2, String s) {
        int symbolsCounter = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            symbolsCounter++;
        }

        System.out.println("I got an object of " + argument1.getClass().getSimpleName() + " class and " + argument2.getClass().getSimpleName() + " class and string with " + symbolsCounter + " characters");
    }
}
