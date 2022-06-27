package ss07_abstract_class_interface.BaiTap.Resizeable;

public class TestResize {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        Rectangle rectangle = new Rectangle(13.2,22.5);
        System.out.println("Area pre-resize : ");
        System.out.println("Circle : "+circle.getArea());
        System.out.println("Rectangle : "+rectangle.getArea());
        circle.resize(50);
        rectangle.resize(50);
        System.out.println("Area after-resize : ");
        System.out.println("Circle : "+circle.getArea());
        System.out.println("Rectangle : "+rectangle.getArea());

    }
}
