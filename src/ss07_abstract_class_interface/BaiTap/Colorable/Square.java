package ss07_abstract_class_interface.BaiTap.Colorable;

public class Square extends Geometric implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return this.getSide()*this.getSide();
    }
}
