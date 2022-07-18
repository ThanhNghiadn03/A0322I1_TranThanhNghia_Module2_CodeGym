package ss15_exception_debug.ThucHanh.exception1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.printf("Nhap vao chi so cua phan tu trong mang : ");
        index = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu thu "+index+" la "+array[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("So luong phan tu vuot qua gioi han mang");
        }

    }
}
