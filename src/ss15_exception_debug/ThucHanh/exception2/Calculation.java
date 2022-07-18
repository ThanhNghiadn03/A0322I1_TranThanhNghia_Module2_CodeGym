package ss15_exception_debug.ThucHanh.exception2;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        int x , y;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao gia tri x : ");
        x = scanner.nextInt();
        System.out.printf("Nhap vao gia tri y : ");
        y = scanner.nextInt();
        calculation(x,y);
    }
    public static void calculation(int x , int y) {
        try {
            System.out.println(x+" + "+y+" = "+(x+y));
            System.out.println(x+" - "+y+" = "+(x-y));
            System.out.println(x+" * "+y+" = "+(x*y));
            System.out.println(x+" / "+y+" = "+(x/y));
        } catch (Exception ex) {
            System.out.println("Xay ra ngoai le : "+ex.getMessage());
        }
    }
}
