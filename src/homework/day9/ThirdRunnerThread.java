package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class ThirdRunnerThread {

    public static void main(String[] args) {
        List<MousePOJOClass> mousePOJOClassList = new ArrayList<>();

        for (int i = 1; i < 281; i++) {
            mousePOJOClassList.add(new MousePOJOClass(i));
        }

        Object lock = new Object();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (true) {
                    synchronized (lock) {
                        if (!mousePOJOClassList.isEmpty()) {
                            mousePOJOClassList.getFirst().peep();
                            mousePOJOClassList.removeFirst();
                        } else {
                            break;
                        }
                    }
                }
            }).start();
        }
    }
}
