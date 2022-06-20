package ss04_class_object_java.BaiTap.PTB2;

import java.util.Scanner;

public class MainQuadraEqua {
    public static void main(String[] args) {
        QuadraticEquation equation1 ;
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quadratic Equation a*x^2 + b*x + c = 0");
        System.out.printf("Enter a : ");
        a = scanner.nextDouble();
        System.out.printf("Enter b : ");
        b = scanner.nextDouble();
        System.out.printf("Enter c : ");
        c = scanner.nextDouble();
        equation1 = new QuadraticEquation(a,b,c);
        System.out.printf("\nEquation : "+equation1.getA()+"*x^2 + "+equation1.getB()+"*x + "+equation1.getC()+" = 0");
        System.out.printf("\n\nDelta : "+equation1.getDiscriminant());
        System.out.printf("\n\nRoot1 : "+equation1.getRoot1());
        System.out.printf("\n\nRoot2 : "+equation1.getRoot2());
    }
}
