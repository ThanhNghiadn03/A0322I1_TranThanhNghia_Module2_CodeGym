package ss07_abstract_class_interface.ThucHanh.interfaceComparable;
import ss06_inheritance.ThucHanh.Circle;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
