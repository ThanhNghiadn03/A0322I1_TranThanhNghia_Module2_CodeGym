package ss13_searching_algorithms.BaiTap.setup_BinarySearch_DeQuy;

import java.util.Scanner;

public class BinarySearch {
    public static int searching(int[] array , int value, int left , int right) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                return searching(array,value,mid+1 , right);
            } else {
                return searching(array,value ,left, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arrayInteger = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("Nhập vào giá trị cần tìm : ");
        int value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        int size = arrayInteger.length;
        System.out.print(BinarySearch.searching(arrayInteger,value,0,arrayInteger.length - 1));
    }
}
