package ss03_mang_phuongthuc_java.ThucHanh.DaoNguocPhanTu;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        byte size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào kích thước của mảng : ");
            size = scanner.nextByte();
        }while (size>20 || size<=0);
        array = new int[size];
        for (int i=0 ; i<size ; i++) {
            System.out.printf("Nhập vào phần tử thứ "+i+" : ");
            array[i]=scanner.nextInt();
        }
        for (int i=0 ; i<size; i++) {
            System.out.printf(array[i]+"   ");
        }
        System.out.println("");
        for (int i=0 ; i<size/2 ; i++) {
            int tmp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = tmp;
        }
        for (int i=0 ; i<size; i++) {
            System.out.printf(array[i]+"   ");
        }
    }

}
