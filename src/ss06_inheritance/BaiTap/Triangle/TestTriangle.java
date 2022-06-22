package ss06_inheritance.BaiTap.Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(2,4,3);
        System.out.println(tri1);
        System.out.println("Perimeter = "+tri1.getPerimeter());
        System.out.println("Area = "+tri1.getArea());

    }
}
