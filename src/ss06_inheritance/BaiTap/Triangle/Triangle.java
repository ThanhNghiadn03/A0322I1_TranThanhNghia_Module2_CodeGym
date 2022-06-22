package ss06_inheritance.BaiTap.Triangle;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.getSide1()+this.getSide2()+this.getSide3();
    }

    public double getArea() {
        return Math.sqrt(this.getPerimeter()*(this.getPerimeter()-
                this.getSide1())*(this.getPerimeter()-this.getSide2())
        *(this.getPerimeter()-this.getSide3()));
    }

    @Override
    public String toString() {
        return "A Triangle with side 1 = "+this.getSide1()+" , side 2" +
                " = "+this.getSide2()+" , side 3 = "+this.getSide3()+
                " , which is a subclass of "+super.toString();
    }
}
