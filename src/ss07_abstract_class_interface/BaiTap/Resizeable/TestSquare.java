package ss07_abstract_class_interface.BaiTap.Resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(3.4);
        square.setSide(2.3);
        System.out.println(square.getSide());
    }
}
