package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class FirstRunnerThread extends Thread{

    public static void main(String[] args) {
        List<MousePOJOClass> mousePOJOClassList = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            mousePOJOClassList.add(new MousePOJOClass(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (MousePOJOClass mouse : mousePOJOClassList) {
                    mouse.peep();
                }
            }).start();
        }
    }
}
