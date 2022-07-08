package ss11_stack_queue.BaiTap.DaoNguocPhanTu_Stack;

import java.util.Scanner;

public class TestReversingElement {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng phần tử trong mảng : ");
        n = scanner.nextInt();
        int[] arrInteger = new int[n];
        for (int i=0 ; i<n ; i++) {
            arrInteger[i] = scanner.nextInt();
        }
        System.out.println("Trước khi đảo ngược : ");
        for (int i : arrInteger) {
            System.out.println(i);
        }
        arrInteger = ReversingElement.reverseInteger(arrInteger,n);
        for (int i : arrInteger) {
            System.out.println(i);
        }
        System.out.println("Sau khi đảo ngược : ");
        for (int i:arrInteger) {
            System.out.println(i);
        }
        String word;
        System.out.printf("Nhập vào 1 từ để đảo ngược từ đó : ");
        word = scanner.next();
        System.out.println("Sau khi đảo ngược : ");
        word = ReversingElement.reverseWord(word);
        System.out.println(word);
    }
}
