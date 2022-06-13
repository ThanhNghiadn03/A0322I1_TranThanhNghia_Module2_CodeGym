package ss01_introduction_java.BaiTap.HienThiLoiChao;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name : ");
        name = scanner.nextLine();
        System.out.printf("Hello "+name);
    }

}
