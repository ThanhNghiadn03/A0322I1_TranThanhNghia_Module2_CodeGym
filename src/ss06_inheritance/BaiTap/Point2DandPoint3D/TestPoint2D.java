package ss06_inheritance.BaiTap.Point2DandPoint3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        p1.setXY(1,2);
        System.out.println(p1.getXY()[0]+","+p1.getXY()[1]);
        Point2D p2 = new Point2D(3,6.7f);
        System.out.println(p2.toString());
    }
}
