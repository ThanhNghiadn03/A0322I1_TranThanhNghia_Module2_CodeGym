package ss03_mang_phuongthuc_java.ThucHanh.TimGTNN_Method;

import java.util.Scanner;

public class Minimum {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i=0 ; i<arr.length ; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arrayNumber;
        byte size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter size of array : ");
            size = scanner.nextByte();
        } while (size<0 || size>20);
        arrayNumber = new int[size];
        for (int i=0 ; i<size ; i++) {
            System.out.printf("Element "+(i+1)+" : ");
            arrayNumber[i] = scanner.nextInt();
        }
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayNumber[i]+"   ");
        }
        int min = minValue(arrayNumber);
        System.out.printf("\nMinimum value : "+min);
    }
}
