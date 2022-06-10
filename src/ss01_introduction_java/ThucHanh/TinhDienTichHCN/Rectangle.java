package ss01_introduction_java.ThucHanh.TinhDienTichHCN;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width , height;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the width : ");
        width = scanner.nextFloat();
        System.out.printf("Enter the height : ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area of Rectangle : "+area);
    }
}
