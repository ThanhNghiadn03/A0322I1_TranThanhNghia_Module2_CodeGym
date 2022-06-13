package ss01_introduction_java.BaiTap.ChuyenDoiTienTe;

import java.util.Scanner;

public class Money {
    final static double rate = 23000.0;
    public static void main(String[] args) {
        int vnd = 0;
        double usd = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter vnd : ");
        vnd = scanner.nextInt();
        usd = vnd/rate;
        System.out.println("USD : "+usd+" $ ");
        System.out.println("");
        System.out.printf("Enter usd : ");
        usd = scanner.nextDouble();
        vnd = (int)(usd*rate);
        System.out.println("VND : "+vnd+" dong ");
    }
}
