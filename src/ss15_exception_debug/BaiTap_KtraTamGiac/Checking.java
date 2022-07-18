package ss15_exception_debug.BaiTap_KtraTamGiac;

import java.util.Scanner;

public class Checking {
    public static void checkingTriangle(int a , int b , int c) throws IllegalTriangleException {
        if ((a+b)<=c || (a+c)<=b || (b+c)<=a) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else {
            System.out.println("Tam giac binh thuong");
        }
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao a : ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao b : ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao c : ");
        c = Integer.parseInt(scanner.nextLine());
        try {
            checkingTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
