package ss11_stack_queue.BaiTap.ThapPhanSangNhiPhan;

import java.util.Scanner;

public class TestBinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal;
        System.out.printf("Nhập vào 1 số thập phân để chuyển sang " +
                "số nhị phân : ");
        decimal = scanner.nextInt();
        System.out.printf("\nSố nhị phân là : ");
        BinaryToDecimal.reverse(decimal);
    }
}
