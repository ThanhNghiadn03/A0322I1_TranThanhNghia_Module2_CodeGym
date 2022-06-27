package ss07_abstract_class_interface.BaiTap.Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[3];
        geometrics[0] = new Circle(2.4);
        geometrics[1] = new Rectangle(2.6,7.3);
        geometrics[2] = new Square(4.4);

        for (Geometric geometric : geometrics) {
            if (geometric instanceof Circle) {
                System.out.println("Area of circle with radius = "+((Circle) geometric).getRadius()+" is "
                        +((Circle) geometric).getArea());
            }else if (geometric instanceof Rectangle) {
                System.out.println("Area of rectangle with length = "+((Rectangle) geometric).getLength()+" , " +
                        "width = "+((Rectangle) geometric).getWidth()+" is "+((Rectangle) geometric).getArea());
            } else if (geometric instanceof Square) {
                System.out.println("Area of square with side = "+((Square) geometric).getSide()+" is "
                + ((Square) geometric).getArea());
                geometric.howToColor();
            }
        }
    }
}
