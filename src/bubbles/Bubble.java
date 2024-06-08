package bubbles;

public class Bubble {
    private static final double VOLUME = 0.3;
    private String composition;

    public Bubble(String composition) {
        this.composition = composition;
    }

    public void bubbleCramp() {
        System.out.println("Cramp!");
    }

}
