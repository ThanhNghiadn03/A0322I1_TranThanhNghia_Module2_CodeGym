package ss06_inheritance.BaiTap.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        double perimeter = 2*Math.PI*this.getRadius();
        return perimeter;
    }

    public double getArea() {
        double area = Math.PI*Math.pow(this.getRadius(),2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Perimeter = "+this.getPerimeter()+", Area = "
                +this.getArea()+
                '}';
    }
}
