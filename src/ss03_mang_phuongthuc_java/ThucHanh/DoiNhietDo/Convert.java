package ss03_mang_phuongthuc_java.ThucHanh.DoiNhietDo;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double cDegrees = 0.0;
        double fDegrees = 0.0;
        byte choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Fahrenheit to Celsius.");
        System.out.println("2. Celsius to Fahrenheit.");
        System.out.printf("Enter your choice : ");
        choice = scanner.nextByte();
        switch (choice) {
            case 1 :
                System.out.printf("\nEnter F degrees : ");
                fDegrees = scanner.nextDouble();
                cDegrees = (fDegrees-32)/(9/5);
                System.out.printf("\nC degrees : "+cDegrees);
                break;
            case 2 :
                System.out.printf("\nEnter C degrees : ");
                cDegrees = scanner.nextDouble();
                fDegrees = (9/5)*cDegrees+32;
                System.out.printf("\nF degrees : "+fDegrees);
                break;
            default:
                System.out.println("Choose wrong !!!");
        }
    }
}
