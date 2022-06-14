package ss03_mang_phuongthuc_java.ThucHanh.GiaTriLonNhat;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int[] arrayValue;
        byte size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter size of values : ");
            size = scanner.nextByte();
        } while (size < 0 || size > 20);
        arrayValue = new int[size];
        for (int i=0 ; i< size ; i++) {
            System.out.printf("Element "+(i+1) + " : ");
            arrayValue[i] =scanner.nextInt();
        }
        int max = arrayValue[0];
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayValue[i]+"   ");
            if (arrayValue[i]>max) {
                max = arrayValue[i];
            }
        }
        System.out.println("\nMax in array : "+ max);
    }
}
