package homework.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourthRunnerThread {

    public static void main(String[] args) {
        List<MousePOJOClass> mousePOJOClassList = new ArrayList<>();

        List<MousePOJOClass> mousePOJOClassListSynchronized = Collections.synchronizedList(mousePOJOClassList);

        for (int i = 1; i < 381; i++) {
            mousePOJOClassListSynchronized.add(new MousePOJOClass(i));
        }

        Object lock = new Object();

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                synchronized (lock) {
                    while (!mousePOJOClassListSynchronized.isEmpty()) {
                        mousePOJOClassListSynchronized.getFirst().peep();
                        mousePOJOClassListSynchronized.removeFirst();
                        try {
                            Thread.sleep(250);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
        }
    }
}
