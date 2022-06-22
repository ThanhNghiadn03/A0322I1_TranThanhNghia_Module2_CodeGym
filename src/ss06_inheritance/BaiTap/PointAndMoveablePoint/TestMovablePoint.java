package ss06_inheritance.BaiTap.PointAndMoveablePoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(1,3,5,6);
        System.out.println(mp1);
        System.out.println(mp1.move());
        System.out.println(mp1.move());
    }

}
