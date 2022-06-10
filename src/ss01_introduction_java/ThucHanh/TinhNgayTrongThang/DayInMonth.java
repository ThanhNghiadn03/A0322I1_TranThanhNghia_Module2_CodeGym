package ss01_introduction_java.ThucHanh.TinhNgayTrongThang;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        byte month;
        System.out.printf("Nhập vào 1 tháng nào đó để xem tháng đó có bao nhiêu ngày : ");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextByte();
        switch (month) {
            case 2 :
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Tháng "+month+" có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Tháng "+month+" có 30 ngày");
                break;
        }
    }
}
