package ss01_introduction_java.ThucHanh.KtraNamNhuan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.printf("Nhập vào 1 năm để ktra có phải năm nhuận không : ");
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("Năm "+year+" là năm nhuận");
                } else {
                    System.out.println("Năm "+year+" không phải là năm nhuận");
                }
            } else {
                System.out.println("Năm "+year+" là năm nhuận");
            }
        } else {
            System.out.println("Năm "+year+" không phải là năm nhuận");
        }
    }
}
