package ss03_mang_phuongthuc_java.BaiTap.ThemPhanTu;

import java.util.Scanner;

public class ElementAdd {
    public static void main(String[] args) {
        int[] arrayNumber;
        byte size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter size of array : ");
            size = scanner.nextByte();
        } while (size<0 || size>20);
        arrayNumber = new int[100];
        for (int i=0 ; i<size ; i++) {
            System.out.printf("Element "+(i+1)+" : ");
            arrayNumber[i] = scanner.nextInt();
        }
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayNumber[i]+"  ");
        }
        int valueAdd = 0;
        byte indexAdd = 0;
        do {
            System.out.printf("\nEnter position : ");
            indexAdd = scanner.nextByte();
        } while (indexAdd<0 || indexAdd>=20);
        System.out.printf("\nEnter value to add : ");
        valueAdd = scanner.nextInt();
        for (int i=(arrayNumber.length-1) ; i>=indexAdd ; i--) {
            if (i==indexAdd) {
                arrayNumber[i] = valueAdd;
                break;
            }
            arrayNumber[i] = arrayNumber[i-1];
        }
        size++;
        System.out.println("");
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayNumber[i]+"   ");
        }
    }
}
