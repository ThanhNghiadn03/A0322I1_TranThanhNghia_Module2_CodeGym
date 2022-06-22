package ss06_inheritance.BaiTap.Point2DandPoint3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        p3.setXYZ(1,5,8);
        System.out.println(p3.getXYZ()[0]+","+p3.getXYZ()[1]+","+p3.getXYZ()[2]);
        Point3D p3_2 = new Point3D(1.1f,2.4f,5);
        System.out.println(p3_2.toString());
    }
}
