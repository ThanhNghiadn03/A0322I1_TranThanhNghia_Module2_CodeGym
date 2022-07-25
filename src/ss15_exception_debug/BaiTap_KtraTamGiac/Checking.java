package ss15_exception_debug.BaiTap_KtraTamGiac;

import ss14_sort_algorithms.baitap.implement_insertion_sort.IllustrationInsertionSort;

import java.util.Scanner;

public class Checking {

    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao a : ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao b : ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao c : ");
        c = Integer.parseInt(scanner.nextLine());
        try {
            IllegalTriangleException.checkingTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
