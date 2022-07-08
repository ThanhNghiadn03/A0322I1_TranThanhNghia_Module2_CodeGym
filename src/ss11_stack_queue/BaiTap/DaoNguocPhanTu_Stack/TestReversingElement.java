package ss11_stack_queue.BaiTap.DaoNguocPhanTu_Stack;

import java.util.Scanner;

public class TestReversingElement {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng phần tử trong mảng : ");
        n = Integer.parseInt(scanner.nextLine());
        int[] arrInteger = new int[n];
        for (int i=0 ; i<n ; i++) {
            arrInteger[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng số trước khi đảo ngược : ");
        for (int i : arrInteger) {
            System.out.println(i);
        }
        System.out.println("Mảng số sau khi đảo ngược");
        ReversingElement.reverseInteger(arrInteger,n);
        String wordUse;
        System.out.print("Nhập vào 1 từ để đảo ngược từ đó : ");
        wordUse = scanner.nextLine();
        System.out.println("Sau khi đảo ngược : ");
        ReversingElement.reverseWord(wordUse);
    }
}
