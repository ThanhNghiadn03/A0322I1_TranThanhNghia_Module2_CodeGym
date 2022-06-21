package ss06_inheritance.BaiTap.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 2*Math.PI*Math.pow(this.getRadius(),2)*this.getHeight();
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = super.getPerimeter()+this.height;
        return perimeter;
    }
    @Override
    public String toString() {
        return "A Cylinder with "+
                " height = "+this.getHeight()+", Area = "+this.getArea()
                +" , Perimeter = "+this.getPerimeter()+
                ", which is subclass of"
                + super.toString();
    }

    public double getVolume() {
        double volume = super.getArea()*this.getHeight();
        return volume;
    }
}
