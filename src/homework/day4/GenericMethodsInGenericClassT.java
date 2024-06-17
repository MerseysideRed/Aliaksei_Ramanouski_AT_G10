package homework.day4;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T argument) {
        System.out.println("I am an object of " + argument.getClass().getSimpleName() + " class");
    }

    public void genericMethodTwoGenArgs(T argument1, T argument2) {
        System.out.println("We are objects of " + argument1.getClass().getSimpleName() + " class and " + argument2.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(T argument, String s) {
        int symbolsCounter = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            symbolsCounter++;
        }

        System.out.println("I got an object of " + argument.getClass().getSimpleName() + " class and string with " + symbolsCounter + " characters");
    }
}
