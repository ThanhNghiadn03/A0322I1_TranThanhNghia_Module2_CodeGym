package ss13_searching_algorithms.ThucHanh.setup_BinarySearch;

import java.util.Scanner;

public class BinarySearchInteger {
    public static int search(int[] array , int value) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ; i<10 ; i++) {
            System.out.print("Nhập vào phần tử arr["+i+"] : ");
            array[i] = scanner.nextInt();
        }
        int value;
        System.out.printf("Nhập vào giá trị cần tìm : ");
        value = scanner.nextInt();
        System.out.println(search(array,value));
    }
}
