package ss04_class_object_java.BaiTap.PTB2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = this.getB()*this.getB() - 4*this.getA()*this.getC();
        return delta;
    }

    public double getRoot1() {
        double root1;
        if (this.getDiscriminant()>=0) {
            root1 = (-b+Math.pow(this.getDiscriminant(),0.5))/(2*a);
            return root1;
        }else {
            return 0.0;
        }
    }

    public double getRoot2() {
        double root2;
        if (this.getDiscriminant()>=0) {
            root2 = (-b-Math.pow(this.getDiscriminant(),0.5))/(2*a);
            return root2;
        } else {
            return 0.0;
        }
    }
}
