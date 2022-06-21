package ss06_inheritance.ThucHanh;

public class Geometric {
    private String color;
    private boolean filled;

    public Geometric() {
        this.color = "Green";
        this.filled = true;
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
    public String toString() {
        return "A shape with color of "+this.getColor()+" and "+(this.isFilled()==true ? "filled" : "not filled");
    }
}
