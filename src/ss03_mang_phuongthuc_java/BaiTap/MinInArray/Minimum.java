package ss03_mang_phuongthuc_java.BaiTap.MinInArray;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        int[] arrayNumber;
        byte size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter size of array : ");
            size = scanner.nextByte();
        } while (size < 0 || size> 20);
        arrayNumber = new int[size];
        for (int i=0 ; i<size ; i++) {
            System.out.printf("Element "+(i+1)+" : ");
            arrayNumber[i] = scanner.nextInt();
        }
        int min = arrayNumber[0];
        for (int i=0 ; i<size ; i++) {
            if (arrayNumber[i]<min) {
                min = arrayNumber[i];
            }
        }
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayNumber[i]+"  ");
        }
        System.out.printf("\nMin in array : "+min);
    }
}
