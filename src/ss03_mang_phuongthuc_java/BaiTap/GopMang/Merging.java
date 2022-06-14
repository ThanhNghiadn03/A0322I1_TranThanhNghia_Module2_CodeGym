package ss03_mang_phuongthuc_java.BaiTap.GopMang;

import java.util.Scanner;

public class Merging {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        byte size1,size2,size3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter size of array 1 : ");
            size1 = scanner.nextByte();
            size3 = size1;
        } while (size1<0 || size1>20);
        do {
            System.out.printf("Enter size of array 2 : ");
            size2 = scanner.nextByte();
            size3 += size2;
        } while (size2<0 || size2>20);
        array1 = new int[size1];
        array2 = new int[size2];
        array3 = new int[size3];
        System.out.println("Array 1 : ");
        for (int i=0 ; i<size1 ; i++) {
            System.out.printf("Element "+(i+1)+" : ");
            array1[i] = scanner.nextInt();
            array3[i] = array1[i];
        }
        System.out.println("Array 2 : ");
        for (int i=0 ; i<size2 ; i++) {
            System.out.printf("Element "+(i+1)+" : ");
            array2[i] = scanner.nextInt();
            array3[i+array1.length] = array2[i];
        }
        System.out.println("Display Array 1 : ");
        for (int i=0 ; i<size1 ; i++) {
            System.out.printf(array1[i]+"  ");
        }
        System.out.println("\nDisplay Array 2 : ");
        for (int i=0 ; i<size2 ; i++) {
            System.out.printf(array2[i] + "  ");
        }
        System.out.println("\nDisplay Array 3 : ");
        for (int i=0 ; i<size3 ; i++) {
            System.out.printf(array3[i]+"  ");
        }
    }
}
