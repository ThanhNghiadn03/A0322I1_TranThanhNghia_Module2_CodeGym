package ss07_abstract_class_interface.ThucHanh.interfaceComparator;

import ss07_abstract_class_interface.BaiTap.Resizeable.Circle;

import java.util.Arrays;

public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.3);
        circles[1] = new Circle(4.2);
        circles[2] = new Circle(1.1);
        System.out.println("Pre-sort : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sort : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
