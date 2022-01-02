package sec_7_oop_composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return this.style;
    }
    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
