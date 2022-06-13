package ss02_vonglap.ThucHanh.KtraSoNguyenTo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        byte count = 0;
        System.out.printf("Nhập vào 1 số để ktra số nguyên tố : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i=1 ; i<=number ; i++) {
            if (number%i==0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
