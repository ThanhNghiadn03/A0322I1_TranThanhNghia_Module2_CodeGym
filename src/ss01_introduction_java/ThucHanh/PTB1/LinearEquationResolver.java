package ss01_introduction_java.ThucHanh.PTB1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1 !!!");
        System.out.println("Cho PTB1 có dạng : \"a*x + b = c\"");
        float a ,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tham số a : ");
        a = scanner.nextFloat();
        System.out.println("Nhập vào tham số b : ");
        b = scanner.nextFloat();
        System.out.println("Nhập vào tham số c : ");
        c = scanner.nextFloat();
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                if (b==c) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            System.out.println("Phương trình có 1 nghiệm x = "+((c-b)/a));
        }
    }
}
