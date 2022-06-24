package ss03_mang_phuongthuc_java.BaiTap.DemKiTuTrongChuoi;

import java.io.IOException;
import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) throws IOException {
        String string1 = "";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào 1 chuỗi : ");
        string1 = scanner.nextLine();
        char char1 = 'a';
        System.out.printf("Nhập vào 1 kí tự để đếm số lần xuất hiện của kí tự đó trong chuỗi : ");
        char1 = (char) System.in.read();
        byte count =0;
        for (int i =0 ; i<string1.length() ; i++) {
            if(string1.charAt(i) == char1) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của "+char1+" trong chuỗi \""+string1+"\" là : "+count);
    }
}
