package ss05_static_access_modifier.BaiTap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
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
}
