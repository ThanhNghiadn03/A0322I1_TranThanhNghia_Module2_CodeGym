package ss13_searching_algorithms.BaiTap.TimChuoiLienTiep;

import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutiveAscendingMax {
    public static void consecutiveString(String word) {
        LinkedList<Character> result = new LinkedList<>();
        for (int i=0 ; i<word.length() ; i++) {
            LinkedList<Character> listCheck = new LinkedList<>();
            listCheck.add(word.charAt(i));
            for (int j=i+1 ; j<word.length() ; j++) {
                if (word.charAt(j) > listCheck.getLast()) {
                    listCheck.add(word.charAt(j));
                } else {
                    break;
                }
            }
            if (listCheck.size() > result.size()) {
                result.clear();
                result.addAll(listCheck);
            }
        }
        for (Character character : result) {
            System.out.print(character);
        }
    }
    public static void main(String[] args) {
        String wordString = "";
        System.out.printf("Nhập vào 1 chuỗi kí tự : ");
        Scanner scanner = new Scanner(System.in);
        wordString = scanner.next();
        System.out.printf("Chuỗi liên tiếp tăng dần có độ dài lớn nhất là : ");
        StringConsecutiveAscendingMax.consecutiveString(wordString);
    }
}
