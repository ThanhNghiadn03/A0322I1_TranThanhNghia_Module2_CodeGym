package ss04_class_object_java.BaiTap.Fan;

public class Fan {
    public static final byte slow = 1;
    public static final byte medium = 2;
    public static final byte fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static byte getSlow() {
        return slow;
    }

    public static byte getMedium() {
        return medium;
    }

    public static byte getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
