package ss06_inheritance.BaiTap.PointAndMoveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.toString());
        p1.setXY(1.3f,4.6f);
        System.out.println(p1.getXY()[0]+","+p1.getXY()[1]);
        Point p2 = new Point(2.2f,3);
        System.out.println(p2.toString());
    }
}
