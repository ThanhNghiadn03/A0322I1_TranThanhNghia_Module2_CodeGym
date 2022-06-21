package ss06_inheritance.ThucHanh;

public class Rectangle extends Geometric {
    private double width;
    private double length;
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = this.width*this.length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2*(this.width+this.length);
        return perimeter;
    }

    public String toString() {
        return "A Rectangle with width = "+this.getWidth()+" and length = "+this.getLength()+
                " , which is a subclass of "+super.toString();
    }
}
