package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class SecondRunnerThread {

    public static void main(String[] args) {
        List<MousePOJOClass> mousePOJOClassList = new ArrayList<>();

        for (int i = 1; i < 19; i++) {
            mousePOJOClassList.add(new MousePOJOClass(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < mousePOJOClassList.size(); j++) {
                    if ((j + 1) % 2 == 0) {
                        mousePOJOClassList.get(j).peep();
                    }
                }
            }).start();
        }
    }
}
