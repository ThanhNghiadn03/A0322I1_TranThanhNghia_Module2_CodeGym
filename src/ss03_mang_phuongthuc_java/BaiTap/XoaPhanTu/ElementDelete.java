package ss03_mang_phuongthuc_java.BaiTap.XoaPhanTu;

import java.util.Scanner;

public class ElementDelete {
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
            arrayNumber[i]=scanner.nextInt();
        }
        for (int i=0 ; i<size ; i++) {
            System.out.printf(arrayNumber[i]+"   ");
        }
        int search = 0;
        boolean confirm = false;
        System.out.printf("\n\nEnter value need delete : ");
        search = scanner.nextInt();
        for (int i=0 ; i<size ; i++) {
            if (arrayNumber[i]==search) {
                confirm = true;
                for (int j=i ; j<(arrayNumber.length-1); j++) {
                    int tmp = arrayNumber[j];
                    arrayNumber[j] = arrayNumber[j+1];
                    arrayNumber[j+1] = tmp;
                }
            }
        }
        if (confirm != true) {
            System.out.println("Not found !!!");
        } else {
            for (int i=0 ; i<size ; i++) {
                System.out.printf(arrayNumber[i]+"   ");
            }
        }

    }
}
