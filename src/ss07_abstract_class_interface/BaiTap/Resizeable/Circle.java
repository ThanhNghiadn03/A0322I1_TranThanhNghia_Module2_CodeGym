package ss07_abstract_class_interface.BaiTap.Resizeable;

public class Circle extends Geometric implements Resizeable{
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(String color , boolean filled , double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.getRadius(),2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2*Math.PI*this.getRadius();
        return perimeter;
    }

    public String toString() {
        return "A circle with radius = "+this.getRadius()+", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius((percent/100)*this.getRadius()+this.getRadius());
    }
}
