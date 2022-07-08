package ss11_stack_queue.BaiTap.KtraChuoiPalindrome_Queue;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.printf("Nhập vào 1 chuỗi để kiểm tra có phải là " +
                "palindrome : ");
        sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
        if (PalindromeChecking.isPalindrome(sentence)) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}
