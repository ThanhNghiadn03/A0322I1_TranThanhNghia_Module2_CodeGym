package ss06_inheritance.ThucHanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square1 = new Square(1.3);
        System.out.println(square1.toString());
        System.out.printf("\nArea = "+square1.getArea());
        System.out.printf("\nPerimeter = "+square1.getPerimeter());
    }
}
