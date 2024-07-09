package homework.day9;

public class MousePOJOClass {
    private String pattern;
    private String name;

    public MousePOJOClass(int number) {
        this.pattern = "Mouse " + number;
        this.name = this.pattern;
    }

    public void peep(){
        System.out.println(this.name + " PEEP");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
