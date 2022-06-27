package ss07_abstract_class_interface.BaiTap.Resizeable;

public class TestResize {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[3];
        geometrics[0] = new Circle(2.3);
        geometrics[1] = new Rectangle(1.7,6.9);
        geometrics[2] = new Square(6.6);
        System.out.println("Pre-Resize : ");
        for (Geometric geometric : geometrics) {
            if (geometric instanceof Circle) {
                System.out.println("Area of circle : "+((Circle) geometric).getArea());
            } else if (geometric instanceof Rectangle) {
                System.out.println("Area of rectangle : "+((Rectangle)geometric).getArea());
            } else {
                System.out.println("Area of square : "+((Square)geometric).getArea());
            }
        }
        System.out.println("After-Resize : ");
        double random = Math.random()*100+1;
        for (Geometric geometric : geometrics) {
            if (geometric instanceof Circle) {
                ((Circle)geometric).resize(random);
                System.out.println("Area of circle("+random+"%) : "+((Circle) geometric).getArea());
            } else if (geometric instanceof Rectangle) {
                ((Rectangle)geometric).resize(random);
                System.out.println("Area of rectangle ("+random+"%) : "+((Rectangle)geometric).getArea());
            } else {
                ((Square)geometric).resize(random);
                System.out.println("Area of square ("+random+"%) : "+((Square)geometric).getArea());
            }
        }
    }
}
