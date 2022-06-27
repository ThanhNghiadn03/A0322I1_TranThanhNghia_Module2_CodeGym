package ss07_abstract_class_interface.BaiTap.Colorable;

public class Geometric implements Colorable{
    private String color;
    private boolean filled;

    public Geometric() {
        this.color = "Green";
        this.filled = false;
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void howToColor() {
    }
}
