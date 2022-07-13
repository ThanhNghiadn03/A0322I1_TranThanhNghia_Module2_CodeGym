package ss13_searching_algorithms.BaiTap.TimChuoiTangDanLonNhat;

import java.util.LinkedList;
import java.util.Scanner;

public class FoundStringAscending {
    public static void stringAscending(String word) {
        LinkedList<Character> resultString = new LinkedList<>();
        for (int i=0 ; i<word.length() ; i++) {
            LinkedList<Character> listCheck = new LinkedList<>();
            listCheck.add(word.charAt(i));
            for (int j = i+1 ; j<word.length() ; j++) {
                if (word.charAt(j) > listCheck.getLast()) {
                    listCheck.add(word.charAt(j));
                }
            }
            if (listCheck.size() > resultString.size()) {
                resultString.clear();
                resultString.addAll(listCheck);
            }
            listCheck.clear();
        }
        for (Character character : resultString) {
            System.out.print(character);
        }
    }
    public static void main(String[] args) {
        String word = "";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào 1 chuỗi : ");
        word = scanner.nextLine();
        System.out.printf("Chuỗi con tăng dần có độ dài lớn nhất là : ");
        FoundStringAscending.stringAscending(word);
    }
}
