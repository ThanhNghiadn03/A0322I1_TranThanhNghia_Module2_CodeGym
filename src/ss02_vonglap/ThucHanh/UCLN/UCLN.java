package ss02_vonglap.ThucHanh.UCLN;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int num1,num2,constNum1, constNum2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = scanner.nextInt();
        constNum1 = num1;
        System.out.printf("Enter number 2 : ");
        num2 = scanner.nextInt();
        constNum2 = num2;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.printf("Ước chung lớn nhất của "+constNum1+" và "+constNum2+" là : "+num1);
    }
}
